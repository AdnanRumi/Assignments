package assignment_10_Strings;

public class Q25 {

	public static void main(String[] args) {
/* When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a 
time, starting with one. Please note one and two can be of different lengths. 
Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium" */
		
		String st1 = "123456789";
		
		String st2 = "ABCDEF";
		
		System.out.println(mergeStrings(st1, st2));

	}
	
	public static String mergeStrings(String str, String str2) {
		
		StringBuilder str3 = new StringBuilder();
	
	for(int i = 0; i < str.length() || i < str2.length(); i++) {
		
		if (i < str.length()) {
			
			str3.append(str.charAt(i));
			
		}
		
        if (i < str2.length()) {
			
			str3.append(str2.charAt(i));
		}
		
	}
	
	return str3.toString();
	}

}
