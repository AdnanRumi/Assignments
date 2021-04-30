package assignment_8_Methods;

public class Q4 {
	
	public static void main(String[] args) {
		// Create a method printHollowRect that prints a 5 on 5 hollow rectangle: 
		
		printHollowRect();
	
	}
	
	public static void printHollowRect() {
		
		for(int i = 1; i < 6; i++) {
			
			if(i == 1 | i == 5) {
				
				System.out.println("*****");

			}else {
				
				System.out.println("*   *");
				
			}	
			
		}

	}

}
