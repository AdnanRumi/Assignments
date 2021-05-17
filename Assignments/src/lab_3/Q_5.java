package lab_3;

public class Q_5 {

	public static void main(String[] args) {
		/* Given a string of even length, return the first half. 
		 * So the string "WooHoo" yields "Woo".
		 * firstHalf("WooHoo") → "Woo"
		 * firstHalf("HelloThere") → "Hello"
		 * firstHalf("abcdef") → "abc" */
		
		String str = "Compassion";
		
		System.out.println(reverse(str));

	}
    
	public static String reverse (String str) {
		
		if(str.length()%2 == 0) {
			
		    return str.substring(0, str.length() / 2);
		
		}else {
			
			return "Invalid entry";
		}
	}
}
