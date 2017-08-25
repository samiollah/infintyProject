package com.nader.aria.infintyProject.model.financial;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.FinanceType;
import com.nader.aria.infintyProject.model.enums.PaymentAndReceiveType;

@Entity
@Table(name="FINANCIAL")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="FINANCIAL_TYPE" , discriminatorType = DiscriminatorType.STRING )
public class Financial extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="VALUE")
	private long value;
	
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER)
	@Column(name="FUND")
	private Fund fund;
	
	@Enumerated(EnumType.STRING)
	@Column(name="FINANCE_TYPE")
	private FinanceType financeType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PAYMAENT_AND_RECEIVE_TYPE")
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
