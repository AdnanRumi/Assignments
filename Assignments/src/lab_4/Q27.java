package lab_4;

public class Q27 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints true if the array contains, somewhere, three 
 * increasing adjacent numbers like 4,5,6,... or 23,24,25.
 *
 * int[] x = {1,4,5,6,2}; //true
 * int[] y = {1,2,3}; //true
 * int[] z = {1,2,4,5,8,9}; //false */
		
		int[] array = {1,2,5,7,11};
		
		System.out.println(consecutiveThreeElements(array));

	}
	
	public static boolean consecutiveThreeElements(int[] x) {
		
		for(int i = x.length -1; i >= 0; i--) {
			
			if(x[i] - 1 == x[i-1] && x[i-1] -1 == x[i-2]) {
				
				return true
				
			}
		}
		
		return false;
	}

}
