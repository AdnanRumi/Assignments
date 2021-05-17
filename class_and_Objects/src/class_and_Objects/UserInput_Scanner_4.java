package class_and_Objects;

import java.util.Scanner;

public class UserInput_Scanner_4 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter the primary number: ");
		
		int a = x.nextInt();
		
		System.out.print("Enter the secondary number: ");
		
		int b = x.nextInt();
		
		x.nextLine();
		
		System.out.print("Enter the phrase: ");
		
		String c = x.nextLine();
		
		System.out.println("Output: " + a + ";" + b + ";" +c);

	}

}
