package lab_4;

public class Q2 {

	public static void main(String[] args) {

/* Write a method that accepts an array and check the length of the array first.If the length is more 
 * than one, check if the first element and last elementare equal. if it is print true, if not print 
 * false.If the length is not more than 1, print not valid an array
 * 
 * int[] x = {1,2,3}; = > false
 * int[] y = {1,2,3,1}; = > true
 * int[] z = {1,2,1}; = > true
 * int[] k = {1}; = > not a valid array */
		
		int[] array = {11};
		
		firstLastElementEqual(array);

	}
	
	public static void firstLastElementEqual(int[] x) {
		
		if(x.length <= 1) {
			
			System.out.println("Not a valid array");
			
			
		}else if(x[0] == x[x.length - 1]) {
			
		    System.out.println("True");
			
		}else {
			
		    System.out.println("False");
	    }

	}

}
