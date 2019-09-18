/*
 * @author: Raymundo Carrasco
 * 
 */
import java.util.Scanner;

public class Unit4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int age; 
		String name;
		
		System.out.print("Enter your name:");
		name = in.nextLine();
		
		System.out.printf("OK %s, Enter your age: ", name);
		age = in.nextInt();
		
		if(age <= 18)
			System.out.println("What's up");
		else if (age < 35 )
			System.out.println("Greetings");
		else
			System.out.println("OK.");
				
			
		
	}

}
