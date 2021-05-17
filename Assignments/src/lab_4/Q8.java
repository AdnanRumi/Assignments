package lab_4;

public class Q8 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints true if it contains a 2 or a 3
 * 
 * int[] x = {2,5};  = > true
 * int[] y = {4,3};  = > true
 * int[] z = {4,5};  = > false */
		
		int[] a = {1,3,5,7};
		
		System.out.println(twoThreeCheck(a));
		

	}
	
	public static boolean twoThreeCheck(int[] x) {
		
		for (int element : x) {
			
			if(element == 2 || element == 3) {
				
				return true;

			}
		}
		
		return false;
		
	}

}
