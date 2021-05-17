package lab_4;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {

/* Write a method that accepts an array and swap the first and last element in the array.
 * Print the modified array
 * int[] x = {1,2,3,4} = > [4,2,3,1]
 * 
 * int[] y = {1,2,3}  = > [3,2,1]
 * 
 * int[] z= {8,6,7,9,5} = > [5,6,7,9,8] */
		
		int[] array = {11,3,5,7,1};
		
		swappingFirstLast(array);

	}
	
	public static void swappingFirstLast(int[] x) {
		
		int[] dummy = Arrays.copyOf(x, x.length);
		
		dummy[0] = x[x.length - 1];
		
		dummy[dummy.length - 1] = x[0];
		
		System.out.println(Arrays.toString(dummy));
		
	}
	
	

}
