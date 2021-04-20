package lab_3;

public class Q_1 {

	public static void main(String[] args) {
		/* Create a method that accepts 1 string, e.g. "Bob", 
		 * return a greeting of the form "Hello Bob!".
		 * helloName("Bob") → "Hello Bob!
		 * "helloName("Alice") → "Hello Alice!
		 * "helloName("X") → "Hello X!" */
		
		String str = "Joshua";
		
		System.out.println(peaceName(str));
		
	

	}
   public static String peaceName (String str) {
	   
	   String str2 = "Peace be with you ";
	   
	   return str2.concat(str) + "!";
   }
}
