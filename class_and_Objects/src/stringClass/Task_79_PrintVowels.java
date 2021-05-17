package stringClass;

public class Task_79_PrintVowels {

	public static void main(String[] args) {
		
		/* Write a program to print only vowel (a,e,o,i,u) in given string
		 * String word = "CybertekSchool";
		 * Output:e,e,o,o */
        
		String bio = "AY was born in Germany, studied in Turkey, and worked in various countries as an educator and peace activist.";

		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		
		
		for(int j = 0; j < bio.length(); j++) {
			
			if(bio.charAt(j) == a || bio.charAt(j) == e || bio.charAt(j) == i || bio.charAt(j) == o || bio.charAt(j) == u) {
				
				System.out.print(bio.charAt(j));
				
				     if(j < bio.length()-1) {
				
				     System.out.print(",")
				}
			
			}
		}
		
	}

}
