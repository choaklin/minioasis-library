package org.minioasis.library.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.minioasis.library.domain.Checkout;
import org.minioasis.library.domain.CheckoutState;
import org.minioasis.library.domain.search.CheckoutCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import static org.minioasis.library.jooq.tables.Checkout.CHECKOUT;
import static org.minioasis.library.jooq.tables.Patron.PATRON;
import static org.minioasis.library.jooq.tables.Item.ITEM;
import static org.minioasis.library.jooq.tables.Biblio.BIBLIO;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class CheckoutRepositoryImpl implements CheckoutRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private DSLContext dsl;
	
	private org.minioasis.library.jooq.tables.Checkout c = CHECKOUT.as("c");
	private org.minioasis.library.jooq.tables.Patron p = PATRON.as("p");
	private org.minioasis.library.jooq.tables.Item i = ITEM.as("i");
	private org.minioasis.library.jooq.tables.Biblio b = BIBLIO.as("b");
	
	public Page<Checkout> findByCriteria(CheckoutCriteria criteria, Pageable pageable){

		Table<?> table = createTable(criteria);
	
		org.jooq.Query jooqQuery = dsl.select()
									.from(table)
									.where(condition(criteria))
									.limit(pageable.getPageSize())
									.offset((int)pageable.getOffset());
		
		Query q = em.createNativeQuery(jooqQuery.getSQL(), Checkout.class);
		setBindParameterValues(q, jooqQuery);
		
		List<Checkout> checkouts = q.getResultList();
		
		long total = findCountByCriteriaLikeExpression(criteria);
		
		return new PageImpl<>(checkouts, pageable, total);
	}
	
	private long findCountByCriteriaLikeExpression(CheckoutCriteria criteria) {

		Table<?> table = createTable(criteria);
		
        long total = dsl.fetchCount(
        						dsl.select(c.ID)
        						.from(table)
        						.where(condition(criteria))
        );

        return total;
    }
	
	private static void setBindParameterValues(Query hibernateQuery, org.jooq.Query jooqQuery) {
	    List<Object> values = jooqQuery.getBindValues();
	    for (int i = 0; i < values.size(); i++) {
	        hibernateQuery.setParameter(i + 1, values.get(i));
	    }
	}
	
	private Table<?> createTable(CheckoutCriteria criteria) {

		final String cardkey = criteria.getCardkey();
		final String barcode = criteria.getBarcode();
		final String title = criteria.getTitle();
		
		Table<?> table = c;
		
		if(cardkey != null) {
			table = table.innerJoin(p).on(c.PATRON_ID.eq(p.ID)).and(p.CARD_KEY.eq(cardkey));
		}
		if(barcode != null) {
			table = table.innerJoin(i).on(c.ITEM_ID.eq(i.ID)).and(i.BARCODE.eq(barcode));
			if(title != null) {
				table.innerJoin(b).on(i.BIBLIO_ID.eq(b.ID)).and(b.TITLE.likeIgnoreCase("%" + title + "%"));
			}
		}
		
		return table;
	}

	private Condition condition(CheckoutCriteria criteria) {
		
	    Condition condition = DSL.trueCondition();
	    
		final Date checkoutFrom = criteria.getCheckoutFrom();
		final Date checkoutTo = criteria.getCheckoutTo();
		final Date dueDateFrom = criteria.getDueDateFrom();
		final Date dueDateTo = criteria.getDueDateTo();
		final Date doneFrom = criteria.getDoneFrom();
		final Date doneTo = criteria.getDoneTo();
		final Set<CheckoutState> states = criteria.getStates();		
		
		if(checkoutFrom != null && checkoutTo != null){
			condition = condition.and(c.CHECKOUT_DATE.ge(new java.sql.Date(checkoutFrom.getTime()))
							.and(c.CHECKOUT_DATE.le(new java.sql.Date(checkoutTo.getTime()))));
		}
		if(dueDateFrom != null && dueDateTo != null){
			condition = condition.and(c.DUE_DATE.ge(new java.sql.Date(dueDateFrom.getTime()))
							.and(c.DUE_DATE.le(new java.sql.Date(dueDateTo.getTime()))));
		}
		if(doneFrom != null && doneTo != null){
			condition = condition.and(c.DONE.ge(new java.sql.Date(doneFrom.getTime()))
							.and(c.DONE.le(new java.sql.Date(doneTo.getTime()))));
		}
		if(states != null && states.size() > 0){
			condition = condition.and(c.STATE.in(states));
		}
		
	    return condition;
	}
	
}
