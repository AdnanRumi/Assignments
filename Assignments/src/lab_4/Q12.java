package lab_4;

public class Q12 {

	public static void main(String[] args) {

/* Write a method that accepts two arrays and prints how many of the arrays have 1 as their 
 * first element
 * 
 * int[] x = {1,2,3}        
 * Int[]y={1,3} 
 * Output=2
 * 
 * int[] x = {7,2,3}        
 * Int[] y = {1} 
 * Output = 1
 * 
 * int[] x = {3,2,4}        
 * Int[] y = {4,3,4} 
 * Output = 0 */
		
		int[] array1 = {1,3,5,1,5,3,1};
		
		int[] array2 = {1,2,1,2,1};
		
		countingOnes(array1, array2);
		

	}
	
	public static void countingOnes(int[] x, int[] y) {
		
		int keyNum = 1;
		
		int count1 = 0;
		
		int count2 = 0;
				
		for(int i = 0; i < x.length; i++) {
			
			if(x[i] == keyNum) {
				
				count1 += 1;
			}
		}
		
        for(int i = 0; i < x.length; i++) {
			
			if(x[i] == keyNum) {
				
				count2 += 1;
			}
		}
        
		int sum = count1 + count2;
        
        System.out.println("The number " + "\"" + keyNum + "\"" + " is repeated in the given arrays : " + sum + " times");
		
	}

}
