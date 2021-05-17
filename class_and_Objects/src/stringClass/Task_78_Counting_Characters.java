package stringClass;

public class Task_78_Counting_Characters {

	public static void main(String[] args) {
	
		/*Write a program to count the number of occurrences for specific char 
		 * String word = "abcabqcabc”
		 * Number of a in this string is: 3 */
		
		String bio = "AY was born in Germany, studied in Turkey, and worked in various countries as an educator and peace activist.";

		char b = 'a';
		
		int sum = 0;
		
		for(int i = 0; i < bio.length(); i++) {
			
			if(bio.charAt(i) == b) {
				
			sum++;
			
			}

        }
		System.out.println("There are " + sum + " " + b + "\'s in the bio.");

	}

}
