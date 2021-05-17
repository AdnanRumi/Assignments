package constructors;

public class Light {
	
	int noOfWatts;
	
	boolean indicator;
	
	String location;
	
	public Light() {
		
		this(111,false);
		
		System.out.println("From constructor #1");
		
	}
	
	public Light(int watt, boolean indic) {
		
		this(watt, indic, "Project #7");
		
		System.out.println("From constructor #2");
		
	}

	public Light(int noOfWatts, boolean indicator, String location) {
		
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		
		System.out.println("From constructor #3");

	}
	
	

}
