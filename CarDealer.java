/*
 * @ Author: Raymundo Carrasco
 * Date: September 23, 2019
 * Description: Making a program as a Car Dealership using switch and if else statements.
 * 
 */

import java.util.Scanner;

public class CarDealer {
	public static void main(String[] args) {
		int creditScore = 0, age = 0 ;

		Scanner input = new Scanner(System.in);
		System.out.println("Hello, I'm a car dealer, \n do you want to buy a car? ");
		String answer = input.next();

		if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("Ok, let me show you what I have....");
			System.out.println("Wait, what's your age?");
			age = input.nextInt();

			if(age >= 25) {
				System.out.println("Ok, good!");
				System.out.println("What type of model do you want?");
				String carModel = input.next();
				
				checkModel(carModel);
			}
			else {
				System.out.println("Sorry, I cannot sell you the car");
			}


		}
		else {
			System.out.println("Ok, come back when you are ready!");

		}


	}

	public static void checkModel(String model) {
		String car;
		switch(model) {
		case "Ferrari_448GTB":
			System.out.println("That's $262,647.00");
			break;
		case "2018_Ferrari_California":
			System.out.println("That's $202,723.00");
			break;
		case "Lambo_Urus":
			System.out.println("That's $200,000.00");
			break;
		default:
			System.out.println("Please come back later!, It's out of Stock");
		}

	}


}