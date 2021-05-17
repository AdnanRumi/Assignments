package lab_3;

public class Q_9 {

	public static void main(String[] args) {
		/* Given a string, return a "rotated right 2" version where the last 2 chars 
		 * are moved to the start. The string length will be at least 2.
		 * right2("Hello") → "loHel"
		 * right2("java") → "vaja"
		 * right2("Hi") → "Hi" */
		
		String str = "Empathy";
		
		System.out.println(rightRotated(str));

	}
	
	public static String rightRotated(String str) {
		
		if(str.length() >= 2) {
		
		    return str.substring(str.length() - 2) + str.substring(0, str.length() -2);
		
		}else {
			
			return "Invalid entry";
			
			
		}
	}

}
