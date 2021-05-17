package lab_4;

public class Q18 {

	public static void main(String[] args) {

/* Write a function that accepts an array and prints the sum of the numbers in the array.
 * Except the number 13 is very unlucky, so it does not count and numbers that come 
 * immediately after a 13 also do not count
 * 
 * int[] x = {1,2,2,1}      = > 6
 * int[] y = {1,1}          = > 2
 * int[] a = {1,2,2,1,13}   = > 6
 * int[] b = {1,2,2,1,13,3} = > 6 */
		
		int[] array = {1,3,5,7,11,13,17,19};
		
		sumElementsExcept13AndFollowing(array);

	}
	
	public static void sumElementsExcept13AndFollowing(int[] x) {
		
		int sumElements = 0; 
		
		for(int i = 0; i < x.length; i++) {
			
			if(x[i] != 13) {
				
				sumElements = sumElements + x[i];
			
			
			}else if(x[i] == 13) {
			    	   
			    	   break;
			    	   
			}
			       
	    }
	
		System.out.println("The sum of elements in the array is " + sumElements);
	} 

}
