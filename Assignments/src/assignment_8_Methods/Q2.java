package assignment_8_Methods;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
		/* Create a method called cube. Write all required code inside this method in order
		 *  to ask the user for a number and then prints the cubed value of that 
		 * number:
		 Example: input: 5 output: 125*/
		
		cube();
		
	}
	
	public static void cube() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int input = scan.nextInt();
		
		int cubedInput = input * input * input;
		
		System.out.println("Output: " + cubedInput);
		
	}

}
