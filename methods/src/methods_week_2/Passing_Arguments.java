package methods_week_2;

public class Passing_Arguments {

	public static void main(String[] args) {
		
		int a = 11;
		
		newMethod(a); //The variable name does not need to match with the one inside the parentheses below.
		             //Having the value inside the parentheses automatically means that it is the variable.
		            //What matters is the address not the variable name. 
                   //		The address is inside of the parentheses.
		
		newMethod(11);
		
		newMethod(a*7);
		

	}

	public static void newMethod(double x) {
		
		System.out.println("The value is " + x);
		
	}

}
