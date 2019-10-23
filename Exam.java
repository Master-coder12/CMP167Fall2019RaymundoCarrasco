
import java.util.Scanner;
public class Exam {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter The SMS Abbreviation: ");

		String abbreviation = scnr.nextLine();
		String translation = "";
		

		if(abbreviation.equalsIgnoreCase("TMI")) {
			translation = "Too Much Information";
			System.out.println(translation);

		} 
		else if(abbreviation.equalsIgnoreCase("LOL")) {
			 translation = "Laughing Out Loud";
			System.out.println(translation);

		}
		else if(abbreviation.equalsIgnoreCase("SMH")) {
			translation = "Shaking My Head";
			System.out.println(translation);

		}
		else {
			translation = "Unknown Abbreviation";
			System.out.println(translation);
		}

		System.out.println(abbreviation + " means " + translation);
		return;

	}
}