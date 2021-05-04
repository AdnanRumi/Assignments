package assignment_10_Strings;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
/* Given a string, consider the prefix string made of the first n chars of the 
string. Does that prefix string appear somewhere else in the string? Assume that 
the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only */
		
		String str = "PeaceLoveCompassionPeaceEmpathyPeaceLove";
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for the first letters of the phrase: ");
		
		int firstLetters = scan.nextInt();
		
		String str2 = str.substring(firstLetters);
		
		System.out.println("Phrase: " + str);
		
		System.out.println("First " + firstLetters + " letters");
		
		int count = 1;
		
		String subString = str.substring(0, firstLetters);
		
		for(int i = 0; i < str.length(); i++) {
						
			if(str2.contains(subString)) {
				
				str2 = str2.replaceFirst(subString, "");
				
			    count = count + 1;
			 
			}
				
		}
		
		if(count > 1) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
		}
		
		System.out.println(subString + " appears " + count + " times");

	}

}
