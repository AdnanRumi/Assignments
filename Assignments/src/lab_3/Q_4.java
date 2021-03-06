package lab_3;

public class Q_4 {
	
	public static void main(String[] args) {
		
		/* Given a string, return the string made of its first two chars, 
		 * so the String "Hello" yields "He". If the string is shorter than length 2, 
		 * return whatever there is, so "X" yields "X", and the empty string "" yields 
		 * the empty string "". 
		 * firstTwo("Hello") → "He"
		 * firstTwo("abcdefg") → "ab"
		 * firstTwo("ab") → "ab" */
		
		String str = "Bystanders of injustice are as guilty as the perpetrators of injustice.";
		
		System.out.println(firstTwoChars(str));
		
	}
    
	public static String firstTwoChars (String str) {
		
		if(str.length() < 2 || str.isEmpty()) {
			
			return str;
			
		}else {
		
		return str.substring(0, 2);
		
		}
	}
}
