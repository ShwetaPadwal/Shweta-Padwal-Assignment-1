/*
4: Voting Eligibility
Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions if necessary.
*/

package Assignment26_09_24;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int age;
		int citizen = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = sc.nextInt();
		System.out.println("NOTE: Write 1 for Yes and 0 for No");
		System.out.println("Are you the citizen");
		System.out.println("1 or 0");
		citizen = sc.nextInt();

		if (age > 18 && citizen == 1)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");
	}

}
