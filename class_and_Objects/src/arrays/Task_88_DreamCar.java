package arrays;

import java.util.*;

public class Task_88_DreamCar {

	public static void main(String[] args) {
		
		/* Create an array that holds cars (Honda,Toyota,Nissan,BMW,Mercedes,Porsche,Ferrari)
		 * •Ask user to enter an index number to choose his dream car. 
		 * •Print the price for selected car.
		 *      Car prices : Honda –Toyota –Nissan (Random price between 20000 and 40000)
		 *                   BMW-Mercedes(Random price between 50000 and 80000)
		 *                   Porsche -Ferrari(Random price between 100000 and 150000
           •Hint : finding a random number between 2 numbers = > ((max -min) + 1) + min
		 */
       
		String[] cars = {"Tata", "Moskvitch", "Anadol", "Maruti", "Geely", "Chery", "Yugo"};
		
		Scanner scan = new Scanner(System.in);
		
		Random rn1 = new Random();
		
		Random rn2 = new Random();
		
		Random rn3 = new Random();
		
	    int random = rn1.nextInt((4_000 - 2_000) +1) + 2_000;
	    
	    int random2 = rn2.nextInt((8_000 - 5_000) +1) + 5_000;
	    
	    int random3 = rn3.nextInt((1_500 + 1_000) +1) + 1_000;
		
		System.out.println("Tata: 1; Moskvitch: 2; Anadol: 3; Maruti: 4; Geely: 5; Chery: 6, Yugo: 7");
		
		System.out.print("Enter the number of your dream car: ");
		
		int input = scan.nextInt();
		
		String carChoice = cars[input - 1];
		
		switch (carChoice) {
		
		case "Tata": case "Moskvitch": case "Anadol":
			
			System.out.println("Price  " + random); break;
			
		case "Maruti": case "Geely":
			
			System.out.println("Price: " + random2); break;
		
		case "Chery": case "Yugo":
			
			System.out.println("Price: " + random3); break;

			// This has not been a good practice for arrays!!!
		}
	}

}
