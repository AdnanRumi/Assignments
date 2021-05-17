package lab_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {

/* Write a method that accepts a number and create and prints a new array of lengthnumber, 
 * containing the numbers 0,1,2,...number-1.
 * fizzArray(4) →[0, 1, 2, 3]
 * fizzArray(1) →[0]
 * fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] */
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int a = scan.nextInt();
		
		int[] array = null;
		
		arrayIndexElements(array, a);;

	}
	
	public static void arrayIndexElements(int[] x, int y) {
		
		x = new int[y]; 
		
		for(int i = 0; i < y; i++) {
			
			x[i] = i;
				
		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
