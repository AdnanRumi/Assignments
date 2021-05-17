package lab_4;

public class Q20 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints true if the array contains a 2 next to a 2 somewhere.
 * 
 * int[] x = {1,2,2}      => true
 * int[] y = {1, 2, 1,2}  => false
 * int[] a = {2,1,2}      => false
 * int[] b = {2,2,1,2}    => true */
		
		int[] array = {1,2,3,4,5,6,7};
		
		System.out.println(consecutiveTwos(array));
		

	}
	
	public static boolean consecutiveTwos(int[] x) {
		
		for(int i = 0; i < x.length; i++) {
			
			if(x[i] == 2) {
				
				int count = i;
				
				if(x[count+1] == 2) {
					
					return true;
					
				}
				
			}
		}
		
		return false;
			
	}

}
