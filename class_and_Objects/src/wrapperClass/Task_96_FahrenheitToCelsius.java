package wrapperClass;

import java.util.Arrays;

public class Task_96_FahrenheitToCelsius {

	public static void main(String[] args) {
		
		//•Write a program to output: 72 degree is equal to 22.22 celcius
		
		String str = "Today is sunny and the temperature will be around 72 degrees fahrenheit.";
		
		String[] arr = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		double fahrenheit = Double.parseDouble(arr[9]);
		
		double celsius = (5 * (fahrenheit - 32)) /9;
		
		System.out.println(Math.round(fahrenheit) + " degrees fahrenheit is equal to " + Math.round(celsius) + " degrees celsius");
		
		
		
		

	}

}
