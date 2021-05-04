package assignment_10_Strings;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
/* Write a program that will print out letters in the alphabetic order accordingly 
 * to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first (capital) letter:");
		
		String first = scan.next();
		
        System.out.println("Enter the last (capital) letter:");
		
		String last = scan.next();
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int firstLetter = str.indexOf(first);
		
		int lastLetter = str.indexOf(last);
		
		System.out.println(str.substring(firstLetter,lastLetter));


	}
	
	
	

}
