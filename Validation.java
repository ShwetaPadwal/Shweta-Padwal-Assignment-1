/*
1: Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions. 
*/

package Assignment26_09_24;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {

		int age;
		double income;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age and Income");
		age = sc.nextInt();
		income = sc.nextDouble();

		if (age >= 18 && age <= 60 && income > 2500)
			System.out.println("Person is eligible for Loan");
		else
			System.out.println("Person is not eligible for loan");
	}
}
