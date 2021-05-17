package lab_4;

public class Q21 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints true if the sum of all 2's in the arrayis exactly 8
 * int[] x = {2, 3, 2, 2, 4, 2}  = > true
 * int[] x = {2, 3, 2, 2, 4, 2, 2}  = > false
 * int[] x = {1, 2, 3, 4}  = > false */
		
		int[] array = {1,2,2,2,3,5,7};
		
		System.out.println(sumofTwos(array));

	}
	
	public static boolean sumofTwos(int[] x) {
		
		int expectedSum = 8;
		
		int sum = 0;
		
		for(int elements: x) {
			
			if(elements == 2) {
				
				sum = sum + elements;
				
				if(sum == expectedSum) {
					
					return true;
				}
			}
				
		}
		
		return false;
		
	}

}
