package assignment_10_Strings;

public class Q18 {

	public static void main(String[] args) {
/* Given two strings, word and a separator sep, return a big string made of 
 * count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This */
		
		String word = "Peace";
		
		String sep = "Love";
		
		String newString = "";
						
		int count = 4;
		
		for(int i = 1; i <= count; i++) {
			
			newString += word.concat(sep);
						
		}
		
		newString = newString.substring(0, (newString.length()-sep.length())); 

		
		System.out.println(newString);

	}

}
