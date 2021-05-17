package lab_4;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {

/* Write a method that accepts 2 arrays and consider the sum of the values in each array.
 * Print the array which has the largest sum. In event of a tie, print "equal"
 * 
 * int[] x = {1,2}    int[]y={3,4}     = > [3,4]
 * 
 * int[] x = {5,6}    int[] y = {3,8}  = > equal 
 * 
 * int[] x = {1,1}    int[] y = {1,0}  = > [1,1] */
		
		int[] array1 = {1,3,5,7};
		
		int[] array2 = {1,3,11};
		
		sumOfElements(array1, array2);
		

	}
	
	public static void sumOfElements(int[] x, int[] y) {
		
		int sum1 = 0;
		
		int sum2 = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			sum1 = sum1 + x[i];	
			
		}
		
        for(int j = 0; j < y.length; j++) {
			
			sum2 = sum2 + y[j];	
			
		}
        
        if(sum1 > sum2) {
        	
        	System.out.println(Arrays.toString(x));
        	
        }else if(sum1 < sum2) {
        	
        	System.out.println(Arrays.toString(y));
        	
        }else {
        	
        	System.out.println("Equal");
        }
		
		
		
	}

}
