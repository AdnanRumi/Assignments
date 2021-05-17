package arrays;

public class PassingArray_ToMethod {

	public static void main(String[] args) {
	
		int[] numbers = {3, 5, 7, 9, 11, 17};
		
		for(int num: numbers) {
			
			myNumbers(num);
			
		}

	}

	public static void myNumbers(int n) {
		
		System.out.println(n + ", ");
		
	}

}
