package lab_4;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

/* Write a method that accepts 2 arrays and prints the second array containing the first and last 
 * elements from the first array.
 * 
 * int[] x = {1,2,3};  
 * int[] y = {};    = > [1,3]
 * 
 * int[] a = {7,4,6,2};
 * int[] b = {};    = > [7,2] */
		
		int[] array1 = {11,33,77,111};
		
		int[] array2 = {};
		
		firstAndLastElements(array1, array2);

	}
	
	public static void firstAndLastElements(int[] x, int[] y) {
		
		int firstElement = x[0];
		
		int lastElement = x[x.length - 1];
		
		x[2] = 0; x[3] = 0;
		
        y = Arrays.copyOf(x, x.length - 2);
		
		y[0] = firstElement;
		
		y[1] = lastElement;
		
		System.out.println(Arrays.toString(y));
	
	}
	

}
