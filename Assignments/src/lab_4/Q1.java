package lab_4;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {

/* Write a method that accepts an array and return true if 6 appears as either the first or last element 
 * in the array. The array will be length 1 or more.
 * 
 * int[] x = {1,2,6};  = > true
 * int[] y = {6,1,2,3}; = > true
 * int[] z = {13,6,1,2,3}; = > false */
		
		int[] arrayWith6 = {1,3,7,11,13,17,6};
		
		int[] keyNumber = {6};
		
		System.out.println(firstOrLastElement(arrayWith6, keyNumber));
		

	}
	//looks if an element (of a second array) or a char expression or string prefix-suffix is 
	//there in the beginning or end of another (main) array
	
	public static boolean firstOrLastElement(int[] x, int[] y) {
		
		if(x.length < 1) {
			
			return false;
			
		}
			
		if(x[0] == y[0] || x[x.length-1] == y[0]) {
				
			return true;
		
		}else {
			
			return false;
		}
		
		
		
	}

}
