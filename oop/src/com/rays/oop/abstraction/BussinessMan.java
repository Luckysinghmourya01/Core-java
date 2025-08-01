package com.rays.oop.abstraction;

public class BussinessMan extends Person implements RichMan, SocialWorker {

	@Override
	public String getName() {
		//System.out.println("dhanraj");
		return "Dhanraj  ";
	}

	@Override
	public void Earmoney() {
		System.out.println("earn money");
	}

	@Override
	public void Donation() {
		System.out.println("Give Donation....");

	}

	@Override
	public void Party() {
		System.out.println("do party....");

	}

	@Override
	public void Helptoother() {
		System.out.println("help to other");

	}

}
