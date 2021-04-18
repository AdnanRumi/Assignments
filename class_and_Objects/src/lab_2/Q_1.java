package lab_2;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		
		/* Write a program with a loop that lets the user enter a series of integer numbers. 
		 * After all the numbers have been entered, the program should display 
		 * the largest and smallest numbers entered.
		 */

		Scanner sc = new Scanner(System.in);
		
		int max = -2147483648;
		
		int min = 2147483647;
		
		for(int i = 0; i < 7; i++) {
			
			System.out.print("Enter your first number: ");

			int num = sc.nextInt();
			
			if(num > max) {
				
				max = num;
				
			}
			
			if(num < min) {
				
				min = num;
				
			}
		}		
		
        System.out.println("Maximum number: " + max);
		
		System.out.println("Minimum number: " + min);
		
	}

}
