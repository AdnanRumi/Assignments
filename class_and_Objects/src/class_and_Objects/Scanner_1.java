package class_and_Objects;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
	   
	  Scanner a = new Scanner(System.in);
	  
	  System.out.print("Enter an int value: ");
	  
	  int i1 = a.nextInt();
	  
	  System.out.println(i1);
	  
	  System.out.println(i1*4);
	  
	  System.out.println(i1%7);

	}

}
