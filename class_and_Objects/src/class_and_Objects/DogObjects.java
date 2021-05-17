package class_and_Objects;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog phino = new Dog();
		
		phino.name = "Kitmir";
		
		phino.age = 7;
		
		phino.color = "black";
		
		phino.breed = "German shepherd";
		
		System.out.println(phino.name);
		
		System.out.println(phino.age);
		
		System.out.println(phino.color);
		
		System.out.println(phino.breed);
		
		phino.barking();
		
		phino.hungry();
		
		phino.sleeping();
		
		System.out.println(phino.barking());

	}

}
