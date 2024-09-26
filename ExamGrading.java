/*
2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.
*/

package Assignment26_09_24;

import java.util.Scanner;

public class ExamGrading {

	public static void main(String[] args) {

		int s1, s2, s3;
		int tot, avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 3 subjects");
		System.out.println("Enter marks for 1st subjects");
		s1 = sc.nextInt();
		System.out.println("Enter marks for 2nd subjects");
		s2 = sc.nextInt();
		System.out.println("Enter marks for 3 subjects");
		s3 = sc.nextInt();

		tot = s1 + s2 + s3;
		avg = tot / 3;

		if (s1 > 40 && s2 > 40 && s3 > 40 && avg >= 60)
			System.out.println(" Student is Passed");
		else
			System.out.println("Student is Failed");

	}

}
