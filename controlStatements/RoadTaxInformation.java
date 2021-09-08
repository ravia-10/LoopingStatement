package com.xworkz.controlStatements;

public class RoadTaxInformation {

	public static void main(String[] args) {
		String state = "AP";
		if (state == "KA") {
			System.out.println("Roadtax of Karnataka is : 3000Rs");
		} else if (state == "AP") {
			System.out.println("Roadtax of Andrapradesh is : 2000Rs");
		} else if (state == "UP") {
			System.out.println("Roadtax of Uttarpradesh is : 2500Rs");
		} else if (state == "TN") {
			System.out.println("Roadtax of TamilNadu is : 4000Rs");
		} else {
			System.out.println("check the state name");
		}
	}

}
