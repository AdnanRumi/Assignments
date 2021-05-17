package lab_4;

public class Q22 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints true if the number 1's is greater than the number 4's
 * int[] x = {1,4,1}  = > true
 * int[] x = {1,4,1,4}  = > false
 * int[] x = {1,1}  = > true */
		
		int[] array = {1,1,3,4,5,7};
		
		System.out.println(onesAndFours(array));

	}
	
	public static boolean onesAndFours(int[] x) {
		
		int count1 = 0;
		
		int count4 = 0;
		
		for(int each: x) {
			
			if(each == 1) {
				
				count1 = count1 + 1;
				
			}
		}
		
        for(int each: x) {
			
			if(each == 4) {
				
				count4 = count4 + 1;
				
			}
		}
        
        if(count1 > count4) {
        	
        	return true;
        	
        }else {
        	
        	return false;
        }
		
	}

}
