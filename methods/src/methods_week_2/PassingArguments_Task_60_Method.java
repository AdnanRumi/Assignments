package methods_week_2;

public class PassingArguments_Task_60_Method {

	public static void main(String[] args) {
		
		calculator(17, 11, "+");    //PRACTICE THIS ONE ONE MORE TIME
		
		calculator(17, 11, "-");
		
		calculator(17, 11, "*");
		
		calculator(17, 11, "/");
		
	}

	public static void calculator(int a, int b, String operator) {
		
		
		switch (operator) {
		
		case "+":
	    
			double calculation1 = a + b;

			
		    System.out.println("Addition = " + calculation1); break;
			
		case "-":
			
			double calculation2 = a - b;
			
		    System.out.println("Subtraction = " + calculation2); break;
			
		case "*":
			
			double calculation3 = a * b;

		    System.out.println("Multiplication = " + calculation3); break;

		case "/":
			
			double calculation4 = a / b;

		    System.out.println("Division = " + calculation4); break;
		
		default:
			
		    System.out.println("Invalid entry");

			
		}
		
		
		
		
		
		



		
	}

}