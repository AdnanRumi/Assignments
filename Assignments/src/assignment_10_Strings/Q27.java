package assignment_10_Strings;

import java.util.Arrays;

public class Q27 {

	public static void main(String[] args) {
/* coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then 
  just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Sample Output:

     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]" */
		
		String main = "cloverleaves cloverleaves";
		
		String coverME = "love";
		
		System.out.println(coverString(main, coverME));

	}
	
	public static String coverString(String a, String b) {
		
		String output = "";
		
		if(a.contains(b)) {
			
			String dummy = "[" + b +"]";
		   
		   output = a.replace(b, dummy);
		   
		   System.out.println(output);
			
		}else {
			
			output = "[" + a + "]";
		}
		
		
		return output;
	}

}
