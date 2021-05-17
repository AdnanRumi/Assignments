package lab_4;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

/* Write a method that accepts an array, and if there is a 2 in the array immediately followed by 
 * a 3, set the 3 element to 0. Print the changed Array
 * 
 * int[] x = {1,2,3}        = > [1,2,0]
 * int[] x = {2,3,5}        = > [2,0,5]
 * int[] x = {1,2,1}        = > [1,2,1]
 * int[] x = {11,2,13,3,2}  = > [11,2,13,3,2] */
		
		int[] array = {1,2,3,5,7}; 
		
		subsequentTwoThree(array);
	}
	
	public static void subsequentTwoThree(int[] x) {
		
		int keyNum = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			if(x[i] == 2 && x[i+1] == 3) {
				
				x[i+1] = keyNum;
				
			}
			
		}
		
		System.out.println(Arrays.toString(x));
		
		
		
		
	}

}
