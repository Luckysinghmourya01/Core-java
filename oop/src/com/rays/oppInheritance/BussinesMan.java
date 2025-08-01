package com.rays.oppInheritance;

public class BussinesMan extends Person {

	
	private double invest;
	private double income;
	private String network;
	
	public void setInvest(double invest) {
		this.invest = invest;
	}
	
	public double getInvest() {
		return this.invest;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return this.income;
	}
	
	public void setNetwork(String network) {
		this.network = network;
	}
	
	public String getNetwork() {
		return this.network;
	}
}
