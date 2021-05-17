package methods_week_2;

public class Loop_CallMethod {

	public static void main(String[] args) {
		
		System.out.println("Peace from the main method");
		
		for(int i = 0; i < 5; i++) {
			
			displayMessage();
			
			System.out.println("Welcome back to the main method");
			
		}

	}

	public static void displayMessage() {
		
		System.out.println("Peace from displayMessage method");
		
	}

}
