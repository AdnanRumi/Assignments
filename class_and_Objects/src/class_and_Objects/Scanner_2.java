package class_and_Objects;

import java.util.Scanner;

public class Scanner_2 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Type an int value: ");
		
		int m = n.nextInt();
		
		System.out.println(m);
		
		System.out.println(m*7);
		
		System.out.println(m%2);

	}

}
