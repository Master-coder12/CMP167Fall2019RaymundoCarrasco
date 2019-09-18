/*
 * @Author: Raymundo Carrasco
 * @Description: This program checks if number is divisible with another number
 */

import java.util.Scanner;

public class Unit4p2 {
	public static void main(String[] args) {
//		int a,b;
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("This program checks if a is divisible by b");
//		System.out.println("Enter a: ");
//		a = in.nextInt();
//
//		System.out.println("Enter b: ");
//		b = in.nextInt();
//		isDivisible(a,b);

		System.out.println(cigarParty(30,false));
		System.out.println(cigarParty(50,false));
		System.out.println(cigarParty(70,true));
	}

	public static void isDivisible(int num1, int num2) {


		if(num1%num2==0) {
			System.out.printf("%d is divisible by %d ", num1, num2);
		}
		else {
			System.out.printf("%d is not divisible by %d", num1, num2 );
		}

	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if(cigars >= 40 && cigars <= 60 && !isWeekend)
			return true;

		else if(isWeekend && cigars >= 40)
			return false;

		else 
			return false;
	}
}
