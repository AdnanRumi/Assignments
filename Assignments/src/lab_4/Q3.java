package lab_4;

public class Q3 {

	public static void main(String[] args) {

/* Write a method that accepts 2 arrays and checks the lengths of the arrays first.If lengths are more 
 * than 1, it prints true if the arrays have the same first element or they have the same last element.
 * If the length of the array is not more than 1, it prints the "array1 is not a validarray " or 
 * "array2 is not a valid array"
 * 
 * int[] x = {1,2,3};  = >true
 * int[] y = {7,3};
 * 
 * int[] x1 = {1,2,3}; = >false
 * int[] y1= {7,3,2};
 * 
 * int[] x2 = {1,2,3}; = > true
 * int[] y2= {1,3};
 * 
 * int[] x3 = {1}; = > Array1 is not valid
 * int[] y3= {7,3};
 * 
 * int[] x4 = {1,2,3}; = > Array2 is not valid
 * int[] y4= {1}; */
		
		int[] array1 = {1,2,3,5,7,11};
		
		int[] array2 = {1,3,7,11,17};
		
		twoArraysFirstLast(array1, array2);
		

	}
	
	public static void twoArraysFirstLast(int[] x, int[] y) {
		
		if(x.length <= 1) {
			
			System.out.println("Array1 is not a valid array");
			
		}else if(y.length <= 1) {
			
			System.out.println("Array2 is not a valid array");

		}else if(x[0] == y[0] || x[x.length-1] == y[y.length-1] ) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");

		}
		
	} 

}
