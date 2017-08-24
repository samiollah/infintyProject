package com.nader.aria.infintyProject.model.financial;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Entity
@Table(name="FUNDS")
public class Fund extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER )
	@Column(name="FUND_MANAGER_ID")
	private FundManager fundManager;
	
	@Column(name="MIN_STOCK")
	private long minStock;
	
	@Column(name="MAX_STOCK")
	private long maxStock;
	
	@Column(name="CURRENT_STOCK")
	private long currentStock;
	

	public FundManager getFundManager() { return fundManager; }
	public void setFundManager(FundManager fundManager) { this.fundManager = fundManager; }
	
	public long getMinStock() { return minStock; }
	public void setMinStock(long minStock) { this.minStock = minStock; }
	
	public long getMaxStock() { return maxStock; }
	public void setMaxStock(long maxStock) { this.maxStock = maxStock; }
	
	public long getCurrentStock() { return currentStock; }
	public void setCurrentStock(long currentStock) { this.currentStock = currentStock; }

}
