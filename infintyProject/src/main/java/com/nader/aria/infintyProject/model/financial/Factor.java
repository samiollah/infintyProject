package com.nader.aria.infintyProject.model.financial;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("FACTOR")
public class Factor extends Payment {

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} , fetch = FetchType.LAZY)
	private List<FactorDetail> factorDetails;
	
	public List<FactorDetail> getFactorDetails(){ return factorDetails; }
	public void setFactorDetails(List<FactorDetail> factorDetails) { this.factorDetails = factorDetails; }
	

}
