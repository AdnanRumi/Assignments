package arrays;

public class Task_90_FindingCars {

	public static void main(String[] args) {
		/* ØCreate a car array that holds 6 car names inside
		 * ØCheck if your array has the car name “Honda”
		 * ØIf it is , print “ I found your car Honda in this array”
		 * ØIf it is not, print “ I could not find your car Honda in this array” */
		
		String[] cars = {"Tata", "Moskvitch", "Maruti", "Geely", "Chery", "Yugo"};
		
		String myCar = "Anadol";
		
		for(int i = 0; i < cars.length; i++) {
		
		if(cars[i].equals("Honda")) {
			System.out.println("I found your car in the array."); break; 
		
		}else {
			
			System.out.println("Lo siento! I could not find your car in the array."); 

		}
		
		}


	}

}
