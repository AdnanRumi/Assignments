package lab_4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints an array with the elements"rotated left”
 * 
 * int[] x = {1,2,3};  = > [2,3,1]
 * int[] y = {17,12,10,8}; = > [12,10,8,17]
 * int[] a = {7,0,0}; = > [0,0,7] */
		
		int[] rotate = {11,1,3,4,5,7};
		
		leftRotation(rotate);

	}
	
	//this method prints the elements of an array after rotating them towards left
	
	public static void leftRotation(int[] x) {
		    
	    int firstIndex = x[0];
	    
	    for(int i = 0; i < x.length-1; i++) {
	    	
	    	x[i] = x[i+1];
	    		    	
	    }
	    
	    //x[x.length-1] = firstIndex;
	    
	    System.out.println(Arrays.toString(x));
	   	
	}
	
} 

