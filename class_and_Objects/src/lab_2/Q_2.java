package lab_2;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		/* A bag of cookies holds 40 cookies. The calorie information on the bag 
		 * claims that there are 10 serving in the bag and that a serving equals 300 calories. 
		 * write a program that lets the user enter the number of cookies he or she actually ate 
		 * and then reports the number of total calories consumed. */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of cookies to learn their calorie value: ");
		
		int a = sc.nextInt();
		
		int totalCookies = 40;
		
		int serving = 10;
		
		int cookiesPerServing = totalCookies / serving;
		
		int caloriePerServing = 300;
		
		int caloriePerCookie = caloriePerServing / cookiesPerServing;
		
		System.out.println(a * caloriePerCookie);
		
		
		
		
	}

}
