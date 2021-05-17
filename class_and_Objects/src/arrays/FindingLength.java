package arrays;

public class FindingLength {

	public static void main(String[] args) {
		
		int[][] numbers = {{1,3,7},{4,7,9,11},{11,13,17,19,21}};
		
		//finding the length of the array row:
		
		System.out.println(numbers.length);
		
		//finding the length of each array length:
		//first array:
		
		System.out.println(numbers[0].length);
		
		//second array:
		
		System.out.println(numbers[1].length);
		
		//third array:
		
		System.out.println(numbers[2].length);
		
		//Using For-Each Loop to print everything:
		
		for(int[] each: numbers) {
			
			for(int eachElements: each) {
				
				System.out.print(eachElements + " ");
				
	    }
			
		    }
		
		System.out.println("\n---------------------------");
				
		//Using For Loop to print everything:
				
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				System.out.print(numbers[i][j] + " ");
		
				
				
			}
		}


	}

}
