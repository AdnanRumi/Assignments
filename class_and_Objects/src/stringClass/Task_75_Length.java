package stringClass;

import java.util.Scanner;

public class Task_75_Length {

	public static void main(String[] args) {
		
		/* Write a program that ask user to enter his/her first name and lastname. 
		 * Display in the console total number of characters. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name and Last name: ");
		
		String a = sc.nextLine();
		
		System.out.println(a.length());

	}

}
