/*
3: Door Access Control
Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.
*/
package Assignment26_09_24;

import java.util.Scanner;

public class DoorAccess {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Do you have a valid ID? (true/false): ");
		boolean hasValidID = sc.nextBoolean();

		System.out.print("Do you have a valid access card? (true/false): ");
		boolean hasAccessCard = sc.nextBoolean();

		System.out.print("Are you an admin? (true/false): ");
		boolean isAdmin = sc.nextBoolean();

		if ((hasValidID == true && hasAccessCard == true) || isAdmin == true) {
			System.out.println("Access Granted");
		} else {
			System.out.println("Access Denied");
		}
	}
}
