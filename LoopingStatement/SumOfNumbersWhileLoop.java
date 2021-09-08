package com.xworkz.controlStatements;

public class SumOfNumbersWhileLoop {

	public static void main(String[] args) {

		// syntax for while loop
		// while (condition) {
		// statement....
		// }

		int i = 10, sum = 0;
		while (i >= 1) {
			sum = sum + i;
			i--;

		}
		System.out.println("Sum of 10 natural Number is : " + sum);
	}

}
