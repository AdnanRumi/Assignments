package assignment_3_ArithmeticOperators;

public class Question_5 {

	public static void main(String[] args) {
		
		int inputSeconds = 7777, hours, minutes, seconds, dummy; 
		
		dummy = inputSeconds % 3600;
		
		minutes = dummy / 60;
		
		hours = inputSeconds / 3600;
		
		seconds = dummy % 60;
		
		inputSeconds = 3600 * hours + (60 * minutes + seconds);
		
		System.out.println( hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		
		
		
		

	}

}
