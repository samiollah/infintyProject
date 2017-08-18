package com.nader.aria.infintyProject.model.financial;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.FinanceType;
import com.nader.aria.infintyProject.model.enums.PaymentAndReceiveType;

public class Financial extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private long value;
	
	private Fund fund;
	
	private FinanceType financeType;
	
	private PaymentAndReceiveType paymaentAndReceiveType;
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public long getValue() { return value; }
	public void setValue(long value) { this.value = value; }
	
	public Fund getFund() { return fund; }
	public void setFund(Fund fund) { this.fund = fund; }
	
	public FinanceType getFinanceType() { return financeType; }
	public void setFinanceType(FinanceType financeType) { this.financeType = financeType; }
	
	public PaymentAndReceiveType getPaymentAndReceiveType() { return paymaentAndReceiveType; }
	public void setPaymentAndReceiveType(PaymentAndReceiveType paymentAndReceiveType) { this.paymaentAndReceiveType = paymentAndReceiveType; }
	
	

}
