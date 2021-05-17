package methods_week_2;

public class Hierarchy_Method {

	public static void main(String[] args) {
		
		System.out.println("I have started with the main");
		
		deep();
		
		System.out.println("I am back to main");


	}
	
	public static void deep() {
		
		System.out.println("Now I am in deep");
		
		deeper();
		
		System.out.println("Now I am back to deep");
	}

	public static void deeper() {
		
		System.out.println("Now I am in deeper");
		
		deepest();
		
		System.out.println("Now I am back to deeper");

		
	}

	public static void deepest() {
		
		System.out.println("Now I am in deepest");
		
	}

}
