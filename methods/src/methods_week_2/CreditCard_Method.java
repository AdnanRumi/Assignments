package methods_week_2;

public class CreditCard_Method {

	public static void main(String[] args) {
		
		double salary = 50_000;
		
		int creditRating = 7;
		
		if(salary >= 20_000 && creditRating >= 7) {
			
			qualified();
			
		}else {
			
			unQualified();
		}
	}

	public static void unQualified() {
		
		System.out.println("I am sorry, you are not qualified for the credit card");
		
	}

	public static void qualified() {
		
		System.out.println("Congratulations! You are qualified for the credit card");
		
	}
   
	 
}
