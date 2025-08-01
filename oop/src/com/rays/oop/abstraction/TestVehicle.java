package com.rays.oop.abstraction;

public class TestVehicle {

	public static void main(String[] args) {

		VehicleCheck vc = new VehicleCheck();
		vc.name();
		System.out.println("name: " + vc.name());
		System.out.print("speed: ");
		vc.byspeed();

		System.out.println("---------------------------------");

		vc.Bname();
		System.out.println("name:" + vc.Bname());
		System.out.print("no of gear: ");
		vc.gear();
		System.out.print("speed: ");
		vc.speed();

	}

}
