package assignment_10_Strings;

public class Q30 {

	public static void main(String[] args) {
/* at3 method gets two strings and returns a string. The first string is the one 
 * that will be manipulated. At the 3rd char position of the target you will 
 * insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla" */
		
		String str1 = "Be you want to see in the world";
		
		String str2 = "the change";
		
		System.out.println(at3(str1, str2));

	}
	
	public static String at3(String a, String b) {
		
		String concatenatedString = "";
		
		concatenatedString = a.substring(0, 3) + b + a.substring(3);
		
		return concatenatedString;
		
	}

}
