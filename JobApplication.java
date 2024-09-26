/* 
5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.
*/

package Assignment26_09_24;

import java.util.Scanner;

public class JobApplication {
	public static void main(String[] args) {
		int degree = 1;
		int exp = 1;
		int criminal = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("NOTE: For yes write 1 and for No 0");
		System.out.println("Have you done drgree");
		degree = sc.nextInt();
		System.out.println("You have Experience");
		exp = sc.nextInt();
		System.out.println("You have any criminal records");
		criminal = sc.nextInt();

		if ((degree == 1 || exp == 1) && criminal == 0)
			System.out.println("Eligible for job");
		else
			System.out.println("Not Eligible for job");
	}

}
