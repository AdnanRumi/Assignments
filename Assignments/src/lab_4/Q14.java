package lab_4;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {

/* Write a method that accepts 2 arrays and prints a new array containing all their elements
 * 
 * int[] x = {1,2}    int[]y={3,4}     = > [1,2,3,4]
 * 
 * int[] x = {4,4}    int[] y = {2,2}  = > [4,4,2,2]
 * 
 * int[] x = {9,2}    int[] y = {3,4}  = > [9,2,3,4] */
		
		int[] array1 = {1,3,5,7};
		
		int[] array2 = {7,5,3,1};
		
		concatTwoArrays(array1, array2);
		
		

	}
	
	public static void concatTwoArrays(int[] x, int[] y) {
		
		int[] concatenatedArrays = new int[x.length + y.length];
		
		for(int i = 0; i < x.length; i++) {
			
			concatenatedArrays[i] = x[i];
		}
		
		for(int i = x.length, j = 0; j < y.length; i++, j ++) {
			
			concatenatedArrays[i] = y[j];
		}
		
		System.out.println(Arrays.toString(concatenatedArrays));
	}

}
