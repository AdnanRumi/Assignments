package lab_3;

public class Q_3 {

	public static void main(String[] args) {
		/* Create a method return a new string made of 3 copies of the last 2 chars 
		 * of the original string. The string length will be at least 2.
		 * extraEnd("Hello") → "lololo"
		 * extraEnd("ab") → "ababab"
		 * extraEnd("Hi") → "HiHiHi" */
		
		String str = "Technophobe"; 
		
		System.out.println(repeatingEnds(str));
		
	}
	
	public static String repeatingEnds (String str) {
		
		if(str.length()< 2) {
			
			return "Invalid entry";
		}

		return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
	}

}
