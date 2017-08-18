package com.nader.aria.infintyProject.model.financial;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Fund extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private FundManager fundManager;
	
	private long minStock;
	
	private long maxStock;
	
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
