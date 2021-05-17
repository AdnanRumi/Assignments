package class_and_Objects;

public class CellPhone {
	
	String brand;
	
	String model;
	
	double camaraPixels;
	
	double screenSize;
	
	String platform;
	
	String color;
	
	double price;
	
	
	public void call () {
		
		System.out.println("Has txt messaging functionality as a new feature");
	}
	
	public void message () {
		
		System.out.println(brand + " " + model + "is run by " + platform + " system");
	}
	
    public void takeAphoto () {
    	
    	System.out.println(brand + " " + model + " has " + camaraPixels + " camara");
    }
}
