package assignment_8_Methods;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		
		/* Complete a method isPalindrome() that will check if the number is a palindrome. 
		 * Print your result as a boolean (true or false).
           Do not convert int into a string!
           Example:
           input: 1001
           output: true
           Example:
           input: 1234
           output: false */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int input = scan.nextInt();
		
		if(isPalindrome(input)){
			
            System.out.println("True");
            
        }else{
        	
            System.out.println("False");
        }       
		
	}
	
	public static boolean isPalindrome(int number) {
		
        int input = number; 
        
        int reversion = 0;
        
        int remainder = 0;

        while (input != 0) {
        	
            remainder = input % 10;
            
            reversion = reversion * 10 + remainder;
            
            input = input / 10;
        }
      
        if (number == reversion) {
        	
            return true;
            
        }else {
        	
        return false;
        
        }

// To be honest, I copied it from the internet and I did not understand the logic of the reversion.
		
		
	}

}
