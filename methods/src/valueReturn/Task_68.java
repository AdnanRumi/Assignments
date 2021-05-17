package valueReturn;

public class Task_68 {

	public static void main(String[] args) {
		
		// Write two methods:1-calculateAge(yearBirth); 
		//and returns the age. 2-yearsUntilRetirement(name,year); 
		//and displays in the console following:  “Mike retires in 36 years”
		//Example: yearsUntilRetirement(“Mike”,1990);
		
		String name = "Abdullah"; 
       
		calculateAge(1974);
		
		int age = calculateAge(1974);
		
		System.out.println("Age :" + age);
		
		yearUntilRetirement("Abdullah", 2021);
		
		int yearsToRetirement = yearUntilRetirement("Abdullah", 2021);
		
		System.out.println(name + " retires in " + yearsToRetirement + " years.");
		
		
	}

	public static int calculateAge(int yearBirth) {
		
		int age, currentYear = 2021;
		
		age = currentYear - yearBirth;
		
		return age;
			
	}

	public static int yearUntilRetirement(String name, int currentYear) {
		
		int retirementAge = 65;
		
		int yearsToRetirement = 0;
				
		yearsToRetirement = retirementAge - calculateAge(1974);
		
		return yearsToRetirement;
		
	}


}
