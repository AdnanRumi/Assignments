package lab_4;

public class Q25 {

	public static void main(String[] args) {

/* Write a method that accepts two arrays of the same length.For every element in array1, consider the 
 * corresponding element in array2(at the same index). Return the count of the number of times that two
 * elements differ by 2 or less, but are not equal.
 * int[] x = {1,2,3};
 * int[] y = {2,3,10};
 * Output: 2
 * 
 * int[] x = {1,2,3};
 * int[] y = {2,3,5};
 * Output:3 */
		
		int[] array1 = {1,3,5,7};
		
		int[] array2 = {2,4,6,7};
		
		differenceTwoElements(array1, array2);
		
	}
	
	public static void differenceTwoElements(int[] x, int[] y) {
		
		int count = 0;
		
		if(x.length == y.length) {
			
			for(int i = 0, j = 0; i < x.length; i++, j++) {
		    		 
		    		 if(x[i] != y[j] && (x[i] - y[j] <= 2 || y[j] - x[i] <= 2)) {
		    		 
		    		      count += 1;
		    		 		    		  
		    	 }else if(x[i] == y[j] || x[i] - y[j] > 2 || y[j] - x[i] > 2) {
		    		 
		    		 count = count;
		    	 }
			}
			
   	     System.out.println("Elements that have 2 or less difference in the given arrays: " + count);

			
		}else if(x.length != y.length) {
			
			System.out.println("Arrays have different lengths"); 
		}
		
		     
	}

}
