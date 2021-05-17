package lab_4;

public class Q10 {

	public static void main(String[] args) {
		
/* Write a method that accepts an array and prints true if the array contains 2 twice or 3 twice.
 * 
 * int[] x = {2,2}; = > true
 * int[] y = {3,3}; = > true
 * int[] a = {2,3}; = > false
 * int[] b = {12,20,42}; = > false
 * int[] c = {2,2,2}; = > false */
		
		int[] array = {1,3,3,5,7,11};
		
		System.out.println(twiceTwoThree(array));
		
	}
	
	public static boolean twiceTwoThree(int[] x) {
		
		int count1 = 0; 
		
		int count2 = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			if(x[i] == 2) {
				
				count1 += 1; 
			}
		}
		
        for(int i = 0; i < x.length; i++) {
			
			if(x[i] == 3) {
				
				count2 += 1; 
			}
			
		}
        
        if(count1 > 2 || count2 > 2) {
        	
        	return false;
        }
        
        if(count1 == 2 || count2 == 2) {
        	
        	return true;
        	
        }else {
        	
        	return false;
        }
        
		
	}

}
