package arrays;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] employees = new int[5];
		
		double hourlyRate = 33;
		
		
		for(int i = 0; i < employees.length; i++) {
			
			System.out.print("Enter the hours you worked: ");
			
			int hours = scan.nextInt();
			
			double weeklyGrossPay = hours * hourlyRate;

			
			System.out.println("Employee with ID #" + (i+1) + " weekly gross pay is " + weeklyGrossPay);
		}

	}

}
