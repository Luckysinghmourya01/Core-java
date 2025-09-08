
package com.rays.javaexception;

public class TestUserFound {

	public static void main(String[] args) throws UserAdmin {

		String name = "Admin123";

		if (name == "Admin" && null!= "Admin") {
			System.out.println("user found");

		} else {

			throw new UserAdmin();
		}

		System.out.println("program ");
	}
}
