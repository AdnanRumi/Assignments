package assignment_10_Strings;

public class Q29 {

	public static void main(String[] args) {
/* This method gets a string and an int, it returns a string. What it does is 
 * to limit the inputted string to a creating number of characters.

Sample Output:

     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla" */
		
		String a = "Love your neighbor as you love yourself.";
		
		int b = 18;
		
		System.out.println(trimmingInput(a, b));

	}
	
	public static String trimmingInput(String str, int indexN) {
		
		String output = "";
		
		output = str.substring(0, indexN);
				
		
		
		
		return output;
	}

}
