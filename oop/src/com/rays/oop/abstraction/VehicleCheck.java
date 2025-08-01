package com.rays.oop.abstraction;

public class VehicleCheck extends Vehicle implements Bycycle, Bike {

	@Override
	public String name() {

		return "Bycycle";
	}

	@Override
	public String Bname() {

		return "Bike";
	}

	@Override
	public void gear() {
		System.out.println("4");
	}

	@Override
	public void speed() {
		System.out.println("70");
	}

	@Override
	public void byspeed() {
		System.out.println("30");

	}

}
