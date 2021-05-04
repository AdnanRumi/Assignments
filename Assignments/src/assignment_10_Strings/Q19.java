package assignment_10_Strings;

import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {
/* Return the number of times that the string "java" appears anywhere in the 
 * given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3 */
		
		String str = "javaxjavaapplejavapearjavaegg";
		
		String subString = "java";
		
		int count = 0;
		
		for(int i = 1; i < str.length(); i++) {
			
			if(str.contains("java")) {
				
				str = str.replaceFirst("java", "");
				
				count += 1; 
			}
			
		}
		
		System.out.println("The substring " + subString + " is repeated " + count + " times");
		
		
	}

}
