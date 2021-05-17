package arrays;

import java.util.Scanner;

public class PassinArray_ToMethod_2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[7];
		
		getArray(numbers);
		
		System.out.println("Here are the numbers you entered: ");
		
		showArray(numbers);
			
	}

	public static void getArray(int[] numbers) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter " + numbers.length + " numbers: ");
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.println("Enter number " + (i+1));
			
			numbers[i] = scan.nextInt();
		}
		
	}

	public static void showArray(int[] numbers) {
		
		for(int numb: numbers) {
		
		   System.out.print(numb + " ");
		}
	}

}
