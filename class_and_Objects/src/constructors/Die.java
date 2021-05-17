package constructors;

import java.util.Random;

public class Die {
	
	int sides;
	
	int value;

	public Die(int sides) {

		this.sides = sides;
		
		
	}

	public Die(int sides, int value) {
		
		this.sides = sides;
		this.value = value;
	}
	
	public void roll() {
		
		Random rnd = new Random();
		
		value = rnd.nextInt(sides);
		
	}
	
	public int getSides() {
		
		return sides;
	}
	
	public int getValue() {
		
		return value;
	}
	
	
	
	

}
