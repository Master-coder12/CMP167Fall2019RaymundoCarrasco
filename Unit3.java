/*
 * @author: Raymundo Carrasco
 */

import java.io.StringWriter;
import java.io.PrintWriter;
public class Unit3 {
	public static void main(String[] args) {
		
		StringWriter sw =  new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		//Sending the characters to the buffer
		
		pw.print("Celine Dion");
		String name = sw.toString();
		//turn sequence of characters into a string
		
		System.out.println(name);
		
		//%(flag) (width) .(precision)specifier
		System.out.printf("Her name was %-20s OK?", name);
	}

}
