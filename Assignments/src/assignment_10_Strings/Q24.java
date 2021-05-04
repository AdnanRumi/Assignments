package assignment_10_Strings;

public class Q24 {

	public static void main(String[] args) {
/* Given a string, print out true if the number of appearances of "java" anywhere 
 * in the string is equal to the number of appearances of "python" anywhere in the 
 * string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false */
		
		String str = "We, peacemakers are here to build peace and spread love.", str2 = str;
		
		String keyword1 = "peace", keyword2 = "love";
		
		int count1 = 0, count2 =0;
		
		for(int i = 0; i < str.length(); i++)
		
		      if(str2.contains(keyword1)) {
			
			      str2 = str2.replaceFirst(keyword1, "");
			  
			      count1 += 1; 
			  
		}
		
		for(int j = 0; j < str.length(); j++)
			
		      if(str2.contains(keyword2)) {
			
			     str2 = str2.replaceFirst(keyword2, "");
			  
			     count2 += 1; 

       }
		
		if(count1 == count2) {
			
			System.out.println("True");
		}else {
			
			System.out.println("False");
		}
	}

}
