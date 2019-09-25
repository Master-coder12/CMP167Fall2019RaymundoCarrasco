/*
 * @ Author: Raymundo
 * Description: 
 * Date:
 */

import java.util.Scanner;
import java.util.Random;

public class LottoGame {
	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		Scanner in = new Scanner(System.in);

		System.out.println("LottoGame is a lotto game for you to play");
		System.out.printf("You have a budget of $%.2f to spend%n", budget);

		System.out.println("Would you like to play?");
		String answer = in.next();

		while(answer.equalsIgnoreCase ("yes")) {
			if(budget >= ticketCost) {

				budget = budget - ticketCost;
				System.out.println("You have played!");
				if(play()) {
					System.out.printf("You Won $%.2f", ticketCost * 2);
					budget += ticketCost * 2;

				}

				else {
					System.out.println("\nYou lost, Come again :)");
				}

				System.out.printf("\nYou have $%.2f", budget);
			}

			else {
				System.out.println("Not enough Money, Go make money and come back :)");
				break;
			}

			System.out.println("\nAwesome, Would you like to play again? Yes? or No?");
			answer = in.next();
		}

		System.out.println("Ok come back soon :)");

	}

	public static boolean play() {
		Random rGen = new Random();
		int num = rGen.nextInt(2);

		return (num > 0)? true:false;

	}





}

