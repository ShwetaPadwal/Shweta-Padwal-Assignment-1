/*
8: Determine the Greatest Number Using Ternary Operator
Write a Java program to find the greatest number among three numbers using the ternary operator.
Input: Three integer numbers from the user.
Output: The greatest number among the three entered numbers.
*/
package Assignment26_09_24;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Enter Number 1");
		num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		num2 = sc.nextInt();
		System.out.println("Enter Number 3");
		num3 = sc.nextInt();

		int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

		System.out.println("Greatest Number is: " + greatest);
	}

}
