package lab_1_Methods;

public class Question_6_Lab {

	public static void main(String[] args) {
		
		chipMonkCarrotParty(33, true);
		
		chipMonkCarrotParty(77, true);
		
		chipMonkCarrotParty(55, true);

		chipMonkCarrotParty(33, false);
		
		chipMonkCarrotParty(77, false);
		
		chipMonkCarrotParty(55, false);


	}

	public static void chipMonkCarrotParty(int carrots, boolean weekend) {
		
		if(carrots > 40 && weekend) {
			
			System.out.println("Carrots consumed = " + carrots + " " + weekend + " => true");
				
		}else if(carrots > 40 && carrots < 60 && weekend) {
			
			System.out.println("Carrots consumed = " + carrots + " " + weekend + " => true");

		}else if((carrots < 40 || carrots > 60) && weekend) {
			
			System.out.println("Carrots consumed = " + carrots + " " + weekend + " => false");
			
	    }else if(carrots < 40) {
	    	
			System.out.println("Carrots consumed = " + carrots + " " + weekend + " => false");

	        
	    }else if(carrots < 40 && weekend) {
	    	
			System.out.println("Carrots consumed = " + carrots + " " + weekend + " => false");

	        
	    }
		}

}
