package arrays;

import java.util.Arrays;

public class Task_92 {

	public static void main(String[] args) {
		/* Write a Java program to store numbers 1 to 10 in an array using data 
		 * instantiation. Then write a for loop to multiply each member of above 
		 * array by 19, this way you will get table of 19 stored in the above array. 
		 * Finally write another for loop to print all the array elements. 
		 * ØYou should get the following output:
		 * 19
		 * 38
		 * 57
		 * 76
		 * 95
		 * 114
		 * 133
		 * 152
		 * 171
		 * 190 */
		
		int[] numb = new int[10];
		
		for(int i = 0; i < numb.length; i++) {
			
			numb[i] = (i +1) * 19;
			
			System.out.println(numb[i]); 

		}
		
		System.out.println(Arrays.toString(numb));
		
		
	}

}
