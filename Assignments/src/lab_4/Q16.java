package lab_4;

public class Q16 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints the number of even numbers in the array.
 * 
 * int[] x = {2,1,2,3,4} = > 3
 * int[] y = {2,2,0}  = > 3
 * int[] z= {1,3,5} = > 0 */
		
		int[] array = {1,2,3,4,5,7,11};
		
		findEvenElement(array);

	}
	
	public static void findEvenElement(int[] x) {
		
		for(int element: x) {
			
			if(element % 2 == 0) {
				
				System.out.print(element + " ");
			}
		}
	}
	
	

}
