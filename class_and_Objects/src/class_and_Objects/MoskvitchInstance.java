package class_and_Objects;

public class MoskvitchInstance {

	public static void main(String[] args) {
		
		Moskvitch vehicle1 = new Moskvitch();
		
		Moskvitch vehicle2 = new Moskvitch();
		
		Moskvitch vehicle3 = new Moskvitch();
		
		
		vehicle1.model = "KIM 10-50";
		
		vehicle2.model = "KIM 10-51";
		
		vehicle3.model = "KIM 10-10";
		
		vehicle1.showPrice();
		
		vehicle2.showPrice();
		
		vehicle3.showPrice();

		
		

	}

}
