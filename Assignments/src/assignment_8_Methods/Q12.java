package assignment_8_Methods;

public class Q12 {
	
	public static void main(String[] args) {
		
/* The danish prince's most famous quote is "to be or not to be". thats a classic example 
 * of boolean logic. the hamletQuote method only returns true if one of or both of the 
 * boolean parameters is true.
example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false  
hint: use the truth table for this, it can be done with one if and a logical operator. */
		
		hamletQuote(true, true);

	}
	
	public static void hamletQuote(boolean a, boolean b) {
		
		if(a == true | b == true) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
	
		}
	}

}
