package lab_4;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints a new array with double the length where its last 
 * element is the same as the original array,
 * 
 * int[] x = {4,5,6};  = > [0,0,0,0,0,6] */
		
		int[] array = {3,5,7,11};
		
		doublePlusSix(array);

	}
	
	public static void doublePlusSix(int[] x) {
		
		int[] dummy = new int[x.length * 2];
		
		for(int i = 0; i < dummy.length - 2; i++) {
			
			dummy[i] = 0;
		}
		
		dummy[dummy.length - 1] = x[x.length - 1];
		
		System.out.println(Arrays.toString(dummy));
		
	}

}
