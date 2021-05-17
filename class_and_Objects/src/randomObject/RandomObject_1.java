package randomObject;

import java.util.*;

public class RandomObject_1 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		int num1 = rn.nextInt(11);
		
		int num2 = rn.nextInt(11);
		
		sum = num1 + num2;
				
		System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
		
		int input = scan.nextInt(); 

		if(input == sum) {
			
			System.out.println("Correct answer, good job!");
			
		}else {
			
			System.out.println("Lo siento, incorrect answer. The correct answer is " + sum);
		}
		
		
		
		
		

	}

}
