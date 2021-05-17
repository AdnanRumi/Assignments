package constructors;

public class Mice {
	
	int numberOfTeeth;
	
	int numberOfVibrissa;
	
	double weight;

	public Mice(int numberOfTeeth) {
		
		this(numberOfTeeth, 20); //Constructor chaining or calling
		
		this.numberOfTeeth = numberOfTeeth;
		
		System.out.println("Peace");
	}

	public Mice(int numberOfTeeth, int numberOfVibrissa) {
		
		this(numberOfTeeth, numberOfVibrissa, 77);  //Constructor chaining or calling
		
		this.numberOfTeeth = numberOfTeeth;
		this.numberOfVibrissa = numberOfVibrissa;
		
		System.out.println("Love");

	}

	public Mice(int numberOfTeeth, int numberOfVibrissa, double weight) {
		
		this.numberOfTeeth = numberOfTeeth;
		this.numberOfVibrissa = numberOfVibrissa;
		this.weight = weight;
		
		System.out.println("Compassion");

	}
	
	public void print() {
		
		System.out.println(numberOfTeeth + " " + numberOfVibrissa + " " + weight);
	}
	
	

}
