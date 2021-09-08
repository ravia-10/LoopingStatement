package com.xworkz.controlStatements;

public class CarInformations {

	public static void main(String[] args) {
		String companyName = "Hyundai";
		switch (companyName) {
		case "KIA":
			System.out.println("Car Model : Sonet");
			System.out.println("Engine Capacity : 998 to 1493 cc");
			System.out.println("Mileage : 18.2 to 24.1 kmpl");
			System.out.println("No of Seats : 5 ");
			break;
		case "Toyota":
			System.out.println("Car Model : Etios Liva");
			System.out.println("Engine Capacity : 1197 cc - 1364 cc");
			System.out.println("Mileage : 17.71 - 23.59 kmpl");
			System.out.println("No of Seats : 5 ");
			break;
		case "Hyundai":
			System.out.println("Car Model : Hyundai Creta");
			System.out.println("Engine Capacity :1353 cc - 1497 cc");
			System.out.println("Mileage : 16.8 - 21.4 kmpl");
			System.out.println("No of Seats : 5 ");
			break;

		default:
			System.out.println("check the car company name");
			break;
		}

	}

}
