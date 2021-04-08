package lab_1_Methods;

public class Question_3_Lab {

	public static void main(String[] args) {
		
		elevenFans(1111);
		
		elevenFans(78);
		
		elevenFans(109);

	}

	public static void elevenFans(double eleven) {
		
		if(eleven % 11 == 0) {
			
			System.out.println("true");

		}else if (eleven % 11 == 1) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
			
			


		}	
		
	}

}
