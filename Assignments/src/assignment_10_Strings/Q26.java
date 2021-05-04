package assignment_10_Strings;

public class Q26 {

	public static void main(String[] args) {
/* uniqueChars is a method that you will code now, should be able to accept any 
 * string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon" */
		
		String uniqueChars = "llllllllloooooooooooovvvvvvvvvvvvvveeeeeeeeeelllllll";
		
		System.out.println(findUniqueChars(uniqueChars));

	}
	
	public static String findUniqueChars(String str) {

		String result = ""; 

		for (int i = 0; i < str.length(); i++) {
			
			if (!result.contains("" + str.charAt(i))) {
				
				result += str.charAt(i);
	        }

        }
		
		return result;
   }
	//We wrote this method in one of the Saturday live sessions with Mukhtar
}
