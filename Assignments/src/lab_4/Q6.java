package lab_4;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

/* Write a method that accepts an array and figure out which is greatest element in the array, 
 * a and set all the other elements to be that value. Print the changed array.
 * 
 * int[] x = {1,2,3}; = > [3,3,3]
 * int[] y = {11,5,9}; = > [11,11,11]
 * int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200] */
		
		int[] a = {1,3,5,7,11,13};
		
		System.out.println(Arrays.toString(maxElement(a)));

	}
	
	public static int[] maxElement(int[] x) {
		
		int defaultNum = x[0];
		
		for(int i =0; i < x.length-1; i++) {
			
			if(defaultNum > x[i+1]) {
				
				x[i+1] = defaultNum;
				
			}else {
				
				defaultNum = x[i+1];
			}
		}
		
		for(int i = 0; i < x.length - 1; i++) {
			
			x[i] = defaultNum;
		}
		
		
		return x;
	}
	
	
	
	
	

}
