package assignment_8_Methods;

public class Q14 {
	
	public static void main(String[] args) {
		
/* This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table */
		
		truthTable(true, true, false);
		
	}
	
	public static void truthTable(boolean a, boolean b, boolean c) {
		
		
		if(a == true && b == true) {
			
			System.out.println("True");
			
		}else if(c == true) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");

		}
	}

}
