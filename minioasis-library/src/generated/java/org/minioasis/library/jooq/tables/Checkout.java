/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.Public;
import org.minioasis.library.jooq.tables.records.CheckoutRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Checkout extends TableImpl<CheckoutRecord> {

    private static final long serialVersionUID = 2140554483;

    /**
     * The reference instance of <code>PUBLIC.CHECKOUT</code>
     */
    public static final Checkout CHECKOUT = new Checkout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckoutRecord> getRecordType() {
        return CheckoutRecord.class;
    }

    /**
     * The column <code>PUBLIC.CHECKOUT.ID</code>.
     */
    public final TableField<CheckoutRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.CHECKOUT_DATE</code>.
     */
    public final TableField<CheckoutRecord, Date> CHECKOUT_DATE = createField("CHECKOUT_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.DONE</code>.
     */
    public final TableField<CheckoutRecord, Date> DONE = createField("DONE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.DUE_DATE</code>.
     */
    public final TableField<CheckoutRecord, Date> DUE_DATE = createField("DUE_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.FINE_PAID_AMOUNT</code>.
     */
    public final TableField<CheckoutRecord, BigDecimal> FINE_PAID_AMOUNT = createField("FINE_PAID_AMOUNT", org.jooq.impl.SQLDataType.DECIMAL(12, 2), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.FINE_PAID_DATE</code>.
     */
    public final TableField<CheckoutRecord, Date> FINE_PAID_DATE = createField("FINE_PAID_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.LOST_AND_DAMAGE_FINE_AMOUNT</code>.
     */
    public final TableField<CheckoutRecord, BigDecimal> LOST_AND_DAMAGE_FINE_AMOUNT = createField("LOST_AND_DAMAGE_FINE_AMOUNT", org.jooq.impl.SQLDataType.DECIMAL(12, 2), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.LOST_OR_DAMAGE_PAID_DATE</code>.
     */
    public final TableField<CheckoutRecord, Date> LOST_OR_DAMAGE_PAID_DATE = createField("LOST_OR_DAMAGE_PAID_DATE", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.RENEWED_NO</code>.
     */
    public final TableField<CheckoutRecord, Byte> RENEWED_NO = createField("RENEWED_NO", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.STATE</code>.
     */
    public final TableField<CheckoutRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.CHAR(40).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.ITEM_ID</code>.
     */
    public final TableField<CheckoutRecord, Long> ITEM_ID = createField("ITEM_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.PATRON_ID</code>.
     */
    public final TableField<CheckoutRecord, Long> PATRON_ID = createField("PATRON_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CHECKOUT.PATRONTYPE_ID</code>.
     */
    public final TableField<CheckoutRecord, Long> PATRONTYPE_ID = createField("PATRONTYPE_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.CHECKOUT</code> table reference
     */
    public Checkout() {
        this(DSL.name("CHECKOUT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CHECKOUT</code> table reference
     */
    public Checkout(String alias) {
        this(DSL.name(alias), CHECKOUT);
    }

    /**
     * Create an aliased <code>PUBLIC.CHECKOUT</code> table reference
     */
    public Checkout(Name alias) {
        this(alias, CHECKOUT);
    }

    private Checkout(Name alias, Table<CheckoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private Checkout(Name alias, Table<CheckoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_CHECKOUT_ITEM_INDEX_8, Indexes.FK_CHECKOUT_PATRONTYPE_INDEX_8, Indexes.FK_CHECKOUT_PATRON_INDEX_8, Indexes.PRIMARY_KEY_8);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CheckoutRecord, Long> getIdentity() {
        return Keys.IDENTITY_CHECKOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CheckoutRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CheckoutRecord>> getKeys() {
        return Arrays.<UniqueKey<CheckoutRecord>>asList(Keys.CONSTRAINT_8);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CheckoutRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CheckoutRecord, ?>>asList(Keys.FK_CHECKOUT_ITEM, Keys.FK_CHECKOUT_PATRON, Keys.FK_CHECKOUT_PATRONTYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Checkout as(String alias) {
        return new Checkout(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Checkout as(Name alias) {
        return new Checkout(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Checkout rename(String name) {
        return new Checkout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Checkout rename(Name name) {
        return new Checkout(name, null);
    }
}