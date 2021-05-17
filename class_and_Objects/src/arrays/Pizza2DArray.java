package arrays;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		String[][] pizzas = {{"pineapple", "pepperoni"},{"anchovis", "mushroom", "olives"},{"chicken", "tomatoes", "eggplant"}};
		
		for(String[] eachArray: pizzas) {
			
			for(String eachElement: eachArray) {
				
				System.out.println(eachElement);
				
				System.out.println("------------------------");
				
				
			}
		}
		
		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println(Arrays.toString(pizzas[1]));
		
		System.out.println(Arrays.toString(pizzas[2]));
		
		


	}

}
