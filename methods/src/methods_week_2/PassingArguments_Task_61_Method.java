package methods_week_2;

public class PassingArguments_Task_61_Method {

	public static void main(String[] args) {
		
		ageCalculator(1938, 2021);
		
		ageCalculator(1939, 2020);
		
		ageCalculator(1973, 2021);
		
		ageCalculator(1974, 2021);
		
		ageCalculator(1944, 2021);
		
		

	}

	private static void ageCalculator(int yearOfBirth, int currentYear) {
		
		int age = currentYear - yearOfBirth;
		
		System.out.println("You are " + age + " years old.");
		
		
		
	}

}
