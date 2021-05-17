package valueReturn;

public class Task_67 {

	public static void main(String[] args) {
		
//		Write a method that accepts 2 numbers and return if they have the same last digit.
//		Sample Output
//		lastDigit(7,17) ->true
//		lastDigit(6,17) ->false
//		lastDigit(3,113) ->true
		
			
		
		if(lastDigitMatching(11, 33)) {
		
		System.out.println("Numbers have the same last digit.");
		
		}
		
		if(lastDigitMatching(177, 77)) {
		
		System.out.println("Numbers have the same last digit.");
		
		}
		
		if(lastDigitMatching(19, 191)) {
		
		System.out.println("Numbers have the same last digit.");

		}
	}

	public static boolean lastDigitMatching(int d, int e) {
		
		
		if(d % 10 == e % 10) {
			
			return true;
			
		}else {
			
			return false;
			
			
		} 
			
			
		}
		 
	}
 
