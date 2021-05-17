package class_and_Objects;

public class Dog {
	
	String breed;
	
	String name;
	
	String color;
	
	int age;
	
	public String barking () {
		
		System.out.println(name + " is barking");
		
		return "This is my well-behaved dog";
	}
	
	public void hungry () {
		
		System.out.println(name + " is hungry");
	}
	
	public void sleeping () {
		
		System.out.println(name + " is sleeping");
	}
    
}
