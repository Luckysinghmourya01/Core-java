package com.rays.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class testLimitOperation {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("raman");
		list.add("kamal");
		list.add("aman");
		list.add("chaman");
		list.add("shuman");
		list.add("krish");
		list.add("abhishek");

		System.out.println("first five name: ");
		list.stream().distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			return e.listIterator();
		})).forEachRemaining( e -> System.out.println(e));

	}
}
