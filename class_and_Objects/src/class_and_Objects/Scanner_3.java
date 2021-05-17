package class_and_Objects;

import java.util.Scanner;

public class Scanner_3 {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.print("Enter a short value: ");
		
		short s = r.nextShort();
		
		System.out.println(s*2);
		
		System.out.println(s%3);
		
		System.out.println("Short value is: " + s);
		
		
		System.out.print("Enter a double value: ");
		
		double st = r.nextDouble();
		
		System.out.println(st * s);
		
		System.out.println((st % 3) * (s + st));
		
		System.out.println("Double value is: " + st);
		
		
		
		System.out.print("Enter a long value: ");
		
		long u = r.nextLong();
		
		System.out.println(u * st * s);
		
		System.out.println("Long value is: " + u + "\n");

		
		System.out.print("Enter a boolean value: ");
		
		boolean v = r.nextBoolean();
		
		System.out.println(u > st && s > u);
		
		System.out.println("Boolean value is: " + v);
		
		
        r.nextLine();
		
		System.out.print("Enter a string value: ");
		
		String w = r.nextLine();
		
		System.out.println(w + " be with you");
	

		
		

	}

}
