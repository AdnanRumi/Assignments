package methods_week_2;

public class Methods_Task_56_Mile_Km {

	public static void main(String[] args) {
		
		kmConverter();
		

	}
	
	public static void kmConverter() {
		
         double mile = 77, km;
		
		 km = mile * 1.609344;
		
		
		System.out.println(mile + " miles is equal to " + km + " kilometers");
	}

}
