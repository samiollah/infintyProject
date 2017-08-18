package com.nader.aria.infintyProject.model.financial;

import java.util.List;

public class Factor extends Payment {

	
	private static final long serialVersionUID = 1L;
	
	private List<FactorDetail> factorDetails;
	
	public List<FactorDetail> getFactorDetails(){ return factorDetails; }
	public void setFactorDetails(List<FactorDetail> factorDetails) { this.factorDetails = factorDetails; }
	

}
