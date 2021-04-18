package lab_2;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		/* Write a program that asks user for the number of males and the number of females 
		 * registered in a class. The program should display the percentage of males and females 
		 * in the class. */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of female students: ");
		
		int female = sc.nextInt();
		
		System.out.print("\nEnter number of male students: ");
		
		int male = sc.nextInt();
		
		int sum = 0;
		
		sum = female + male;
		
		System.out.println("Female students: " + female * 100/sum + "%");
		
		System.out.println("Male students: " + male * 100/sum + "%");

				
			
		
	}

}
