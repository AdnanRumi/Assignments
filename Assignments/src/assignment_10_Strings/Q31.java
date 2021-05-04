package assignment_10_Strings;

public class Q31 {

	public static void main(String[] args) {
/* Palindrome is a word, phrase, or sequence that reads the same backward as 
forward, e.g., madam or nurses run.
So method isPalindrome checks that and returns true if check is palindrome and 
false if it is not.

- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though 
there is space in between.

Sample Output:

     isPalindrome("Noon") ==> true

     isPalindrome("I am not palindrome") ==> false

     isPalindrome("wooden") ==> false

     isPalindrome("Nurses Run") ==> true */
		
		String str = "Nurses Run";
		
		System.out.println(isPalindrome(str));

	}
	
    public static boolean isPalindrome(String a) {
    	
    	a = a.replace(" ", "");
		
        String reversion = ""; 
        
        
        for(int i = a.length()-1; i >=0; i--) {
        	
        	reversion += a.charAt(i);
        	
        }
        
        reversion = reversion.replace(" ", "");
      
        if (reversion.equalsIgnoreCase(a)) {
        	
            return true;
            
        }else {
        	
        return false;
        
        }

    }
}
