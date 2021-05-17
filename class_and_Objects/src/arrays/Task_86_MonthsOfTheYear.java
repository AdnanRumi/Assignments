package arrays;

import java.util.Scanner;

public class Task_86_MonthsOfTheYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of the month: ");
		
		int month = scan.nextInt();
		
		String monthsOfTheYear[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.println("The name of the month is: " + monthsOfTheYear[month-1]);
		
		
		

	}

	
	}


