package class_and_Objects;

public class Moskvitch {
   
	String make = "Moskvitch";
	
	String model;
	
	double price;
	
	public void showPrice() {
		
		switch(model) {
		
		case "KIM 10-50":
			price = 15_000; break;
			
		case "KIM 10-51":
			price = 17_000; break;
		
		case "KIM 10-52":
			
			price = 21_000; break;
			
		default: 
			
			System.out.println("This model is discontinued");
		}
		
		System.out.println("Price: " + price);
	}
	
	
	
	
}
