package assignment_10_Strings;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
/* A sandwich is two pieces of bread with something in between. Print the string 
 * that is between the first and last appearance of "bread" in the given string, 
 * or return string "nothing" if there are not two pieces of bread.

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter */
		
		String sandwich = "breadpeanutbutterjellybread"; 
				
		String sandwich2 = "";
		
		String sandwichMain = "bread";
		
		String noSandwich = "nothing"; 
		
		int count = 0;
			
			for(int i = 1; i < sandwich.length(); i++) {
				
				if(sandwich.contains(sandwichMain)) {
				
				sandwich2 = sandwich2.replaceFirst(sandwichMain, "");
				
				count += 1;
				
				String filling = sandwich.replace("bread", ""); 
				
				System.out.println(filling); break;
				
			    }else {
					
					System.out.println(noSandwich);
				}
		    }
		
		

	}
	
	

}
