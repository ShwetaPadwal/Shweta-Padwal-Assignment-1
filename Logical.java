/*
6. Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions
*/

package Assignment26_09_24;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		num = sc.nextInt();

		if (!(num >= 10 && num <= 20))
			System.out.println("Number is not between 10 to 20");
		else
			System.out.println("Number is between 10 to 20");
	}
}
