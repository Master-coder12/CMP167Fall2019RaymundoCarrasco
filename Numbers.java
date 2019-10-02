/*
 * @Author: Raymundo Carrasco
 * Date: October 2, 2019
 * Description:
 * A program that:
 * STEP A: prints the sum of two numbers
 * STEP B: prints all numbers 1 to n when n is given from the user
 * STEP C: print all squares from 1 to n
 * STEP D: print all even numbers from 1 to 100 (using a while, for, and do while loop).
 */

import java.util.Scanner;
import java.util.Random;

public class Numbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// User's input

		Random rand = new Random(); //Random numbers
		int num = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3;
		int number = 0;
		int square;
		int squareNumber;
		int numberWhile = 0;

		int n;

		num3 = num + num2; // Step A : Adding two different random values
		System.out.println(num3);

		System.out.println("Please input a integer value: "); //Step B
		n = input.nextInt();

		for(int i = 1; i <= n; i++) { // Step B
			System.out.print(i + " ");
		}

		System.out.println(""); // Space between loops

		for(square = 0; square < 100; square++) { //Step C: Printing all squared numbers from 1 to 100 using a for loop

			squareNumber = square * square;

			System.out.print(squareNumber + " ");
		}

		System.out.println(""); // Space between loops

		for(int i = 0; i <= 100; i += 2) { //Step D: Printing all Even numbers from 1 to 100 using a for loop
			System.out.print(i + " ");
		}

		System.out.println(""); // Space between loops

		while (number != 100){ //Step D: Printing all Even numbers from 1 to 100 using a while loop
			number = number + 2;
			System.out.print(number + " ");
		}

		System.out.println(""); // Space between loops

		do { //Step D: Printing all Even numbers from 1 to 100 using a do While loop
			numberWhile = numberWhile + 2;	
			System.out.print(numberWhile + " ");
		}
		while(numberWhile < 100);

		System.out.println(""); // Space between loops



	}

}
