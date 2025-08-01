package com.rays.oop;

public class AutoMobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GARE = 5;

	public void setcolor(String color) {
		this.color = color;

	}

	public String getcolor() {
		return this.color;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return this.speed;
	}

	public void setmake(String make) {
		this.make = make;
	}

	public String getmake() {
		return this.make;
	}
	
	public void accelerater() {
		speed = speed +10;
		System.out.println("accelerater.current speed:"+ this.speed);
	}
	
	public void breeak() {
		speed = speed - 10;
		System.out.println("break current speed: "+ this.speed);
	}
}
