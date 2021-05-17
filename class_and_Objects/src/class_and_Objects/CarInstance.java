package class_and_Objects;

public class CarInstance {

	public static void main(String[] args) {
		
		Car vehicle1 = new Car();
		Car vehicle2 = new Car();
		Car vehicle3 = new Car();
		vehicle1.make = "Anadol";
		vehicle2.make = "Moskvitch";
		vehicle3.make = "Tata";
		vehicle1.model = "A1";
		vehicle2.model = "KIM 10-50";
		vehicle3.model = "Sierra";
		vehicle1.year = 1966;
		vehicle2.year = 1940;
		vehicle3.year = 1991;
		vehicle1.color = "Baby blue";
		vehicle2.color = "Maroon";
		vehicle3.color = "Silver";
		vehicle1.currentSpeed = 133;
		vehicle2.currentSpeed = 99;
		vehicle3.currentSpeed = 55;
		
		System.out.println(vehicle2.make + ", " + vehicle2.year);
		
		vehicle1.carInfo();
		vehicle2.carInfo();
		vehicle3.carInfo();
		
		vehicle1.drive();
		vehicle2.drive();
		
		vehicle1.showCurrentSpeedLimit(60);
		vehicle2.showCurrentSpeedLimit(70);
		vehicle3.showCurrentSpeedLimit(60);
		
		vehicle1.accelerate(19);
		vehicle2.accelerate(22);
		vehicle3.accelerate(6);

	}

}
