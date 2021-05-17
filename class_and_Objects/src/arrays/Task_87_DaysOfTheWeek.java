package arrays;

import java.util.Scanner;

public class Task_87_DaysOfTheWeek {

	public static void main(String[] args) {
		
		String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of the day of the week: ");
		
		int day = scan.nextInt();
		
		System.out.println("The day is " + daysOfTheWeek[day-1]);

	}

}
