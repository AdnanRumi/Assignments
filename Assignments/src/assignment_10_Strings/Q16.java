package assignment_10_Strings;

public class Q16 {

	public static void main(String[] args) {
/* Given a string word, print true if "java" appears starting at index 0 
or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
The string should be 4 and more characters.

Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false */
		
		String str = "Lpeace";
		
	    if(str.substring(0).equals("peace")) {
			
			System.out.println("True");
			
		}else if(str.substring(1).equals("peace")) {
			
			System.out.println("True");

		}else {
			
			System.out.println("False");

		}

	}

}
