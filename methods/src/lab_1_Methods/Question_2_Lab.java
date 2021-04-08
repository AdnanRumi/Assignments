package lab_1_Methods;

public class Question_2_Lab {

	public static void main(String[] args) {
		
		sixFans(3,3);
		
		sixFans(9,3);

		sixFans(1,6);

		sixFans(2,5);

	}

	public static void sixFans(int num1, int num2) {
	    
		if(num1 == 6 || num2 == 6) {
			
			System.out.println("true");
			
		}else if(num1 + num2 == 6) {
			
			System.out.println("true");

		}else if(num1 - num2 == 6 || num2 - num1 == 6) {
			
			System.out.println("true");

		}else {
			
			System.out.println("false");

		}
		
	}

}
