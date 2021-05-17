package arrays;

import java.util.Arrays;

public class Task_95_AverageCalculation_2D {

	public static void main(String[] args) {
		
		int[][] studentGrades = {{68,75, 54, 80}, {100, 64, 20, 50}, {10, 35, 40, 90}};
		
		int sum = 0;
		
		int mathSum = 0;
		
		//Calculate the average of student-1: 
		
		for(int i = 0; i < 1; i++) {
			
			for(int j = 0; j < studentGrades[i].length; j++)
			
			sum += studentGrades[i][j];
			
			System.out.println("Sum of student-1's grades: " + sum);
			
		}
		
		System.out.println("Average for student-1: " + sum / studentGrades[0].length );
		
		System.out.println("---------------------");
		
		//Calculate the total math scores:
		
		for(int i = 0; i < studentGrades.length; i++) {
			
			for(int j = 0; j < 1; j++) {
				
				mathSum += studentGrades[i][j];
				
			}
			
		}
		
		System.out.println("Sum of math grades: " + mathSum);

		
	

	}

}
