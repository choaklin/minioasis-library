/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  The ASF licenses this file to You
* under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.  For additional information regarding
* copyright in this work, please see the NOTICE file in the top level
* directory of this distribution.
*/

package org.minioasis.library.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patron_type")
public class PatronType implements Serializable {

	private static final long serialVersionUID = 918000566742490418L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@NotNull
	@Column(name = "name", unique = true , nullable = false)
	private String name;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "expiry_date", nullable = false)
	private Date expiryDate;
	
	@NotNull
	@Column(name = "biblio_limit", nullable = false)
	private Integer biblioLimit;
	
	@NotNull
	@Column(name = "duration", nullable = false)
	private Integer duration;
	
	@NotNull
	@Column(name = "max_overdue_period_per_biblio", nullable = false)
	private Integer maxOverduePeriodPerBiblio;
	
	@NotNull
	@Column(name = "max_no_of_overdue_biblios", nullable = false)
	private Integer maxNoOfOverdueBiblios;
	
	@NotNull
	@Column(name = "max_arrearage" , columnDefinition = "DECIMAL(12,2)" , nullable = false)
	private BigDecimal maxArrearage;
	
	@NotNull
	@Column(name = "max_owing_fine_period_per_biblio", nullable = false)
	private Integer maxOwingFinePeriodPerBiblio;
	
	@NotNull
	@Column(name = "max_no_of_reservations", nullable = false)
	private Integer maxNoOfReservations;
	
	@NotNull
	@Column(name = "max_collectable_period", nullable = false)
	private Integer maxCollectablePeriod;
	
	@NotNull
	@Column(name = "max_uncollected_no", nullable = false)
	private Integer maxUncollectedNo;
	
	@NotNull
	@Column(name = "max_cant_reserve_period", nullable = false)
	private Integer maxCantReservePeriod;
	
	@NotNull
	@Column(name = "max_no_of_renew", nullable = false)
	private Integer maxNoOfRenew;
	
	@NotNull
	@Column(name = "min_renewable_period", nullable = false)
	private Integer minRenewablePeriod;
	
	@NotNull
	@Column(name = "resume_borrowable_period", nullable = false)
	private Integer resumeBorrowablePeriod;
	
	@NotNull
	@Column(name = "max_lost_payment_duration", nullable = false)
	private Integer maxLostPaymentDuration;
	
	@NotNull
	@Column(name = "fine_rate" , columnDefinition = "DECIMAL(12,2)" , nullable = false)
	private BigDecimal fineRate;

	@NotNull
	@Column(name = "memberFee" , columnDefinition = "DECIMAL(12,2)" , nullable = false)
	private BigDecimal memberFee;

	@NotNull
	@Column(name = "deposit" , columnDefinition = "DECIMAL(12,2)" , nullable = false)
	private BigDecimal deposit;
	
    @OneToMany(mappedBy="patronType")
	private Set<Patron> patrons = new HashSet<Patron>(0);
    
    @OneToMany(mappedBy="patronType")
	private Set<Checkout> checkouts = new HashSet<Checkout>(0);
    
    @OneToMany(mappedBy="patronType")
	private Set<Reservation> reservations = new HashSet<Reservation>(0);

	public PatronType() {
	}

	public PatronType(String name, Date startDate, Date expiryDate, Integer biblioLimit, Integer duration,
			Integer maxOverduePeriodPerBiblio, Integer maxNoOfOverdueBiblios, BigDecimal maxArrearage,
			Integer maxOwingFinePeriodPerBiblio, Integer maxNoOfReservations, Integer maxCollectablePeriod,
			Integer maxUncollectedNo, Integer maxCantReservePeriod, Integer maxNoOfRenew, Integer minRenewablePeriod,
			Integer resumeBorrowablePeriod, Integer maxLostPaymentDuration, BigDecimal fineRate, BigDecimal memberFee,
			BigDecimal deposit) {
		this.name = name;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
		this.biblioLimit = biblioLimit;
		this.duration = duration;
		this.maxOverduePeriodPerBiblio = maxOverduePeriodPerBiblio;
		this.maxNoOfOverdueBiblios = maxNoOfOverdueBiblios;
		this.maxArrearage = maxArrearage;
		this.maxOwingFinePeriodPerBiblio = maxOwingFinePeriodPerBiblio;
		this.maxNoOfReservations = maxNoOfReservations;
		this.maxCollectablePeriod = maxCollectablePeriod;
		this.maxUncollectedNo = maxUncollectedNo;
		this.maxCantReservePeriod = maxCantReservePeriod;
		this.maxNoOfRenew = maxNoOfRenew;
		this.minRenewablePeriod = minRenewablePeriod;
		this.resumeBorrowablePeriod = resumeBorrowablePeriod;
		this.maxLostPaymentDuration = maxLostPaymentDuration;
		this.fineRate = fineRate;
		this.memberFee = memberFee;
		this.deposit = deposit;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getBiblioLimit() {
		return this.biblioLimit;
	}

	public void setBiblioLimit(Integer biblioLimit) {
		this.biblioLimit = biblioLimit;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getMaxOverduePeriodPerBiblio() {
		return this.maxOverduePeriodPerBiblio;
	}

	public void setMaxOverduePeriodPerBiblio(Integer maxOverduePeriodPerBiblio) {
		this.maxOverduePeriodPerBiblio = maxOverduePeriodPerBiblio;
	}

	public Integer getMaxNoOfOverdueBiblios() {
		return maxNoOfOverdueBiblios;
	}

	public void setMaxNoOfOverdueBiblios(Integer maxNoOfOverdueBiblios) {
		this.maxNoOfOverdueBiblios = maxNoOfOverdueBiblios;
	}

	public BigDecimal getMaxArrearage() {
		return this.maxArrearage;
	}

	public void setMaxArrearage(BigDecimal maxArrearage) {
		this.maxArrearage = maxArrearage;
	}

	public Integer getMaxOwingFinePeriodPerBiblio() {
		return this.maxOwingFinePeriodPerBiblio;
	}

	public void setMaxOwingFinePeriodPerBiblio(
			Integer maxOwingFinePeriodPerBiblio) {
		this.maxOwingFinePeriodPerBiblio = maxOwingFinePeriodPerBiblio;
	}

	public Integer getMaxNoOfReservations() {
		return this.maxNoOfReservations;
	}

	public void setMaxNoOfReservations(Integer maxNoOfReservations) {
		this.maxNoOfReservations = maxNoOfReservations;
	}

	public Integer getMaxCollectablePeriod() {
		return this.maxCollectablePeriod;
	}

	public void setMaxCollectablePeriod(Integer maxCollectablePeriod) {
		this.maxCollectablePeriod = maxCollectablePeriod;
	}

	public Integer getMaxUncollectedNo() {
		return this.maxUncollectedNo;
	}

	public void setMaxUncollectedNo(Integer maxUncollectedNo) {
		this.maxUncollectedNo = maxUncollectedNo;
	}

	public Integer getMaxCantReservePeriod() {
		return this.maxCantReservePeriod;
	}

	public void setMaxCantReservePeriod(Integer maxCantReservePeriod) {
		this.maxCantReservePeriod = maxCantReservePeriod;
	}

	public Integer getMaxNoOfRenew() {
		return this.maxNoOfRenew;
	}

	public void setMaxNoOfRenew(Integer maxNoOfRenew) {
		this.maxNoOfRenew = maxNoOfRenew;
	}

	public Integer getMinRenewablePeriod() {
		return this.minRenewablePeriod;
	}

	public void setMinRenewablePeriod(Integer minRenewablePeriod) {
		this.minRenewablePeriod = minRenewablePeriod;
	}

	public Integer getResumeBorrowablePeriod() {
		return this.resumeBorrowablePeriod;
	}

	public void setResumeBorrowablePeriod(Integer resumeBorrowablePeriod) {
		this.resumeBorrowablePeriod = resumeBorrowablePeriod;
	}

	public Integer getMaxLostPaymentDuration() {
		return this.maxLostPaymentDuration;
	}

	public void setMaxLostPaymentDuration(Integer maxLostPaymentDuration) {
		this.maxLostPaymentDuration = maxLostPaymentDuration;
	}

	public BigDecimal getFineRate() {
		return this.fineRate;
	}

	public void setFineRate(BigDecimal fineRate) {
		this.fineRate = fineRate;
	}

	public BigDecimal getMemberFee() {
		return memberFee;
	}

	public void setMemberFee(BigDecimal memberFee) {
		this.memberFee = memberFee;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public Set<Patron> getPatrons() {
		return patrons;
	}

	public void setPatrons(Set<Patron> patrons) {
		this.patrons = patrons;
	}

	public Set<Checkout> getCheckouts() {
		return this.checkouts;
	}

	public void setCheckouts(Set<Checkout> checkouts) {
		this.checkouts = checkouts;
	}

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public boolean equals(Object other) {

		if (this == other) return true;
		if ( !(other instanceof PatronType) ) return false;
		final PatronType that = (PatronType) other;
		return this.id.equals(that.getId());

	}

	public int hashCode() {
		return id == null ? System.identityHashCode(this) : id.hashCode();
	}

}