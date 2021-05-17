package arrays;

public class Printing2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = {{1,3,5,7},{1,11},{11,33,77}};
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println("----------------------");

		
		for(int[] eachArray: numbers) {
			
			for(int eachElement: eachArray) {
				
				System.out.println(eachElement);
			}
		}

	}

}
