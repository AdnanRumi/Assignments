package methods_week_2;

public class GreatestNumber_Method_Task_58 {

	public static void main(String[] args) {
		
		greatestValue();
		
		

	}

	private static void greatestValue() {
		
		int i =117, j = 177, k = 77;
		
		if(i > j && i > k ) {
			
			System.out.println(i + " has the greatest value");
			
		}else if(j > i && j > k) {
			
			System.out.println(j + " has the greatest value");

		}else if(k > i && k > j) {
			
			System.out.println(k + " has the greatest value");

		}else {
			
			System.out.println("They have equal values");

		}
		
	}

}
