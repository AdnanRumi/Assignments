package assignment_8_Methods;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		
		/* Create a method called next3 . This method gets an int argument and prints 
		 * the next 3 numbers after that number. Call the method from main method and 
		 * pass num to it.
		 * enter number
		 * 1
		 * next 3 are:
		 * 2 3 4
           (put a space between numbers) */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int input = scan.nextInt();
		
		next3(input);
		
	}
	
	public static int next3(int num) {
		
		for(int i = 1; i < 4; i++) {
			
			num = num + 1;
			
			System.out.println(num);
			
		}
		
		return num;
		
	    
	    	
	    	
	    }
	}

