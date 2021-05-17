package lab_1_Methods;

public class Question_1_Lab {

	public static void main(String[] args) {
		
     strings("Peace", 3);
     
     strings("Peace", 5);
     
     strings("Peace", 7);


          
     

	}

	public static void strings(String string, int number) {
		
		String display = "";
		
		for(int i = 0; i < number; i++) {
			
			display = display + string; //CONCATENATION
		}
		
		System.out.println(display);
		

			
	}
		
		
}

