package com.rays.cnstr;

public class Bussinessman extends Person {

	private String invest;
	private String income;
	
	public Bussinessman(String name , String age , String invest , String income) {
		super(name, age);
		this.invest = invest;
		this.income = income;
	}
	
	public String getInvest() {
		return this.invest;
	}
	
	public String getIncome() {
		return this.income;
	}
}
