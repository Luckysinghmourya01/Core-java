package com.rays.oop.abstraction;

public class TestBussinessMan {

	public static void main(String[] args) {

		RichMan rm = new BussinessMan();
		rm.Donation();
		rm.Earmoney();
		rm.Party();

		SocialWorker sw = new BussinessMan();
		sw.Helptoother();
		System.out.println("------------------------");

		BussinessMan bm = new BussinessMan();
		System.out.println("rich person");
		bm.getName();
		System.out.println("name= "+bm.getName());
		bm.Donation();
		bm.Earmoney();
		bm.Party();
		bm.Helptoother();

	}
}
