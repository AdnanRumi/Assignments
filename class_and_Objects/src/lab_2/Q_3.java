package lab_2;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		/* Write a program that asks the user for a positive nonzero integer value. 
		 * The program should use a loop to get the sum of all the integers 
		 * from 1 up to the number entered. */
       
		Scanner sc = new Scanner(System.in);
				
		int sum = 0;
		
		for(int i =1; i < 5; i++) {
		
		System.out.print("Enter a positive number greater than zero: ");
		
		int a = sc.nextInt();
		
		   if(a > 0) {
		
		   }else {
			
		   System.out.println("Invalid entry");
		}

		sum = sum + a;
				
		}
		
		System.out.println("The sum is: " + sum);
	}

}
