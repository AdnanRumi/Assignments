package arrays;

import java.util.Arrays;

public class Pizza2DPrintingEachArray {

	public static void main(String[] args) {
		
		String[][] pizzas = {{"pineapple", "pepperoni"},{"anchovis", "mushroom", "olives"},{"chicken", "tomatoes", "eggplant"}};
		
		for(String array3: pizzas[2]) {
			
			System.out.println(array3);
			
		}
		
		System.out.println("------------------------");
		
		for(String array2: pizzas[1]) {
			
			System.out.println(array2);
		}
		
		System.out.println("------------------------");
		
		for(String array1: pizzas[0]) {
			
			System.out.println(array1);
			
			
		}
		
		System.out.println("------------------------");
		
		System.out.println(Arrays.toString(pizzas[2]));

	}

}
