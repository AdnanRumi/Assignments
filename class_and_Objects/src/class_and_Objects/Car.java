package class_and_Objects;

public class Car {
	
	String make;
	
	String model;
	
	int year;
	
	String color;
	
	int currentSpeed;
	
	public void carInfo() {
		
		System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color);
	}
	
	public void drive() {
		
		System.out.println(year + " " + make + " " + model + " gives you the comfort of driving.");
		
	}
	
	public void showCurrentSpeedLimit(int speedLimit) {
		
		if(currentSpeed <= speedLimit) {
			
			System.out.println(make + " is driving at " + currentSpeed + "mph following the speed limit " + speedLimit);
			
		}else {
			
		    System.out.println(make + " is driving at " + currentSpeed + "mph over the speed limit" + speedLimit);
			
		}
	  
	}
    public void accelerate(int mph) {
    	
    	currentSpeed = currentSpeed + mph;
    	
    }
  }