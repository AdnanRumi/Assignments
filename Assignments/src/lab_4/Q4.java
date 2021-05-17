package lab_4;

public class Q4 {

	public static void main(String[] args) {

/* Write a method that accepts an array and prints the sum of all elements in the array
 * 
 * int[] x = {1,2,3}; = > 6
 * int[] y = {5,11,2}; = > 18
 * int[] z = {7,0,0}; = > 7
 * int[] a = {3,-2,10,4}; = > 15 */
		
		int[] array = {1,2,3,4,5,6,7};
		
		sumElements(array);
	
	}
	
	public static void sumElements(int[] x) {
		
		int sum = 0;
		
		for(int eachElement: x) {
			
			sum += eachElement;
			
		}
		
		System.out.println("The sum of the elements in the array is " + sum);
	}

}
