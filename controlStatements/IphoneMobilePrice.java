package com.xworkz.controlStatements;

public class IphoneMobilePrice {

	public static void main(String[] args) {
		String model = "iphone 5";

		if (model == "iphone") {
			System.out.println("Price of " + model + " is : 30000 Rs");
		} else if (model == "iphone4") {
			System.out.println("Price of " + model + " is : 35000 Rs");
		} else if (model == "iphone 4S") {
			System.out.println("Price of " + model + " is : 45000 Rs");
		} else if (model == "iphone 5") {
			System.out.println("Price of " + model + " is : 39000 Rs");
		} else if (model == "iphone 6S") {
			System.out.println("Price of " + model + " is : 50000 Rs");
		} else {
			System.out.println("check the model name of mobile");
		}

	}

}
