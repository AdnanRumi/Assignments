package lab_4;

public class Q17 {

	public static void main(String[] args) {

/* Write a method that accepts an array and print the difference between the largest and smallest values 
 * in the array.
 * 
 * int[] x = {10,3,5,6}  = > 7
 * int[] y = {7,2,10,9}  = > 8
 * int[] z= {2,10,7,2}   = > 8 */
		
		int[] array = {1,3,5,7,11,17};
		
		differenceMaxMin(array);

	}
	
	public static void differenceMaxMin(int[] x) {
		
		int defaultNum = x[0];
		
		int defaultNum2 = x[0];
		
		int max = 0;
		
		int min = 0;
		
		for(int i = 0; i < x.length - 1; i++) {
			
			if(defaultNum > x[i + 1]) {
				
				x[i + 1] = defaultNum;
				
			}else {
				
				defaultNum = x[i + 1];
				
			}
			
		}
		
		for(int j = 0; j < x.length - 1; j++) {
			
			if(defaultNum2 < x[j + 1]) {
				
				x[j + 1] = defaultNum2;
				
			}else {
				
				defaultNum2 = x[j + 1];
				
			}
				
		}
		
		int difference = defaultNum - defaultNum2;
		
		System.out.println("The difference between the maximum and minumum element is " + difference);	
	}

}
