/*
7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. 
The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !.
*/

package Assignment26_09_24;

import java.util.Scanner;

public class WeatherCondition {

	public static void main(String[] args) {

		int temp;
		String isRaining;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the temperature in °C: ");
		temp = sc.nextInt();

		System.out.print("Is it raining (Yes/No)? ");
		isRaining = sc.next();

		if (temp >= 20 && temp <= 30 && isRaining.equals("No"))
			System.out.println("It's safe to go outside.");
		else
			System.out.println("It's not safe to go outside.");

	}
}
