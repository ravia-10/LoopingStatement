package com.xworkz.controlStatements;

public class SumOfNumbersDoWhileLoop {

	public static void main(String[] args) {
//syntax of do while
//	do {
//		
//	} while (condition);
		
		int i =10, sum=0;
		do {
			sum = sum + i;
			i--;
		} while ( i>=1);
		System.out.println("Sum of 10 Natural numbers is :"+sum);

	}

}
