package lab_1_Methods;

public class Question_4_Lab {

	public static void main(String[] args) {
		
//		The deers in VA spend most of the day playing. 
//		In particular, they play if the temperature is between 60 and 90. 
//		Unless it is summer, then the upper limit is 100 instead of 90.
//		Write a method that accepts temperature and a boolean isSummer, 
//		prints true if the deers play and false otherwise.
//
//		deerPlay(70, false); - > true
//		deerPlay(95, false); - > false
//		deerPlay(95, true); - > true
	   
		deersVirginia(55, false);
		
		deersVirginia(55, true);
		
		deersVirginia(77, false);
		
		deersVirginia(77, true);
		
		deersVirginia(99, false);
		
		deersVirginia(99, true);
		
		deersVirginia(101, true);

	}

	public static void deersVirginia(int temperature, boolean isSummer) {
		
		if(temperature < 60 && !isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + false);
			
		}else if (temperature < 60 && isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + false);
			
		}else if(temperature >= 60 && temperature <= 90 && !isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + true);

		}else if((temperature >= 60 && temperature <= 90) && isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + true);

		}else if(temperature > 90 && temperature <= 100 && isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + true);
	
		}else if((temperature > 90 && temperature <= 100) && !isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + false);

		}else if(temperature > 100 && isSummer) {
			
			System.out.println("Temperature is " + temperature + " it is summer: " + isSummer + " --> " + false);

		}
		
	}

}
