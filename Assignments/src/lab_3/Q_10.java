package lab_3;

public class Q_10 {

	public static void main(String[] args) {
		/* Given a string, return true if the first 2 chars in the string also appear 
		 * at the end of the string, such as with "edited".
		 * frontAgain("edited") → true
		 * frontAgain("edit") → false
		 * frontAgain("ed") → true */
		
		String str = "Educated";
		
		if(str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() -2))) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");

		}
		
		

	}

}
