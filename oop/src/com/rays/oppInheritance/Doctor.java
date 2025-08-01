package com.rays.oppInheritance;

public class Doctor extends Person{
	
	private String specilist;
	private String surgery;
	
	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}
	public String getSpecilist() {
		return this.specilist;
	}
	
	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}
	
	public String getSurgery() {
		return this.surgery;
	}
	

}
