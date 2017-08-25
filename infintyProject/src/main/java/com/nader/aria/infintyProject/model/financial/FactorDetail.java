package com.nader.aria.infintyProject.model.financial;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="FACTOR_DETAILS")
public class FactorDetail extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER)
	@Column(name="FACTOR_ID")
	private Factor factor;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="AMOUNT_OF")
	private long amountOf;
	
	@Column(name="PRICE_PER_UNIT")
	private long pricePerUnit;
	
	@Column(name="SUM")
	private long sum;
	
	
	public Factor getFactor() { return factor; }
	public void setFactor(Factor factor) { this.factor = factor; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public long getAmountOf() { return amountOf; }
	public void setAmountOf(long amountOf) { this.amountOf = amountOf; }
	
	public long getPricePerUnint() { return pricePerUnit; }
	public void setPricePerUnint(long pricePerUnit) { this.pricePerUnit = pricePerUnit; }
	
	public long getSum() { return sum; }
	public void setSum(long sum) { this.sum = sum; }


}
