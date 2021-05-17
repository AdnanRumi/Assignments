package arrays;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {
		/* ØCreate an array with 10 elements
		 * ØInitialize each array element with random values between 
		 * 0 and 100 but less than 100Ø
		 * Print each array element */
		
		Random rn = new Random();
		
		int[] randomNumbers = new int[11];
		
		randomNumbers[0] = rn.nextInt(100);
		
		for(int i = 0; i < randomNumbers.length; i++) {
			
			randomNumbers[i] = rn.nextInt(100);
			
			System.out.println(randomNumbers[i]);
			
		}

	}

}
