package lab_3;

public class Q_6 {

	public static void main(String[] args) {
		/* Given a string, return a version without the first and last char, 
		 * so "Hello" yields "ell". The string length will be at least 2.
		 * withoutEnd("Hello") → "ell"
		 * withoutEnd("java") → "av"
		 * withoutEnd("coding") → "odin" */
		
		String str = "slover";
		
		System.out.println(removingFirstAndLastLetters(str));

	}
	
	public static String removingFirstAndLastLetters(String str) {
		
		if(str.length() > 2) {
			
			return str.substring(1, str.length()-1).toUpperCase();

		}else {
			
			return "Invalid entry";
		}
		
	}

}
