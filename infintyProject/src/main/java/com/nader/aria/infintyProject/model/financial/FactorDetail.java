package com.nader.aria.infintyProject.model.financial;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class FactorDetail extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private Factor factor;
	
	private String title;
	
	private long amountOf;
	
	private long pricePerUnit;
	
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
