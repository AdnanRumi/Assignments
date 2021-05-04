package assignment_10_Strings;

public class Q28 {

	public static void main(String[] args) {
/* This method gets two strings (text and badWord) and returns a string. 
 * Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said " */
		
		String a = "The only thing necessary for the triumph of evil is for good people to do nothing.";
		
		String b = "evil";
		
		System.out.println(removeProfanity(a, b));
		

	}
	
	public static String removeProfanity(String text, String badWord) {
		
		String cleanLanguage = "";
		
		if(text.contains(badWord)) {
			
			cleanLanguage = text.replace(badWord, "---");
		}
		
		
		return cleanLanguage;
	}

}
