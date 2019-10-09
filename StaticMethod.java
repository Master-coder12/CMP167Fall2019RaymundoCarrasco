/*
 * @Author: Raymundo
 * Date: October 7, 2019
 * Description:
 * Part A: Create a static method that takes in 3 int parameters and return the product of those three numbers
 * Part B: Create a static method that takes in two parameters n,m and calculate the sum of the range between those numbers (inclusive) return the result 
 * Part C: Create a static method that gets on int value as argument can calculate the sum from 1 -n and return average of sum
 * Part D: Create main method and test out your methods
 */

import java.util.Scanner;

public class StaticMethod {

	public static void main(String[] args) { // Main method to test out the other three methods (Product, Sum, and Average)
		Scanner input = new Scanner(System.in);

		System.out.println("Input 3 Numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int method;

		method = Product(a,b,c);
		System.out.println("The product is: " + method);

		System.out.println("\nInclude two more numbers");
		int o = input.nextInt();
		int p = input.nextInt();

		int method2;
		method2 = SumTwo(a,b);
		System.out.println("\nThe Sum of these numbers are: " + method2);

		int method3;
		System.out.println("\nEnter one more number:");
		method3 = input.nextInt();
		double avg = AverageInt(method3);
		System.out.println("The average between number" + method3 + " and avg is: " + avg);

	}

	public static int Product(int a, int b, int c){
		return a * b * c;
	}

	public static int SumTwo(int a, int b) {
		int sum = 0;
		if(a<b) {
			for(int i = 0; i<b; i++) {
				sum +=1;
			}
		}
		if(b<a) {
			for(int i =0; i <a; ++i) {
				sum += 1;
			}
		}
		return sum;
	}
	public static double AverageInt(int a) {
		double sum = 0.0;
		for(int i=1; i<=a; ++i) {
			sum +=1;
		}
		double average = sum/a;
		return average;
	}


}
