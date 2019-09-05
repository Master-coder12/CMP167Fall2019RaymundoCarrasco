/*
 * 
 * @author: Raymundo Carrasco
 * Description: Random number Generator
 * Date: September 5, 2019
 * 
 */

import java.util.Random; 
public class Test {
	public static void main(String[] args) {
		
		Random randGen;
		int num; 
		int num2;
		
		randGen = new Random(); //Statement that produces random numbers
		num = randGen.nextInt(15) + 1 ; //Random numbers from 1 - 15
		num2 = 14; 
		
		System.out.println("The number of today is " + num);
		
		if (num == num2) {
			System.out.println("It's a match.");
		}
		
		else {
			System.out.println("It's not a match.");
		}
		
		
	}

}
