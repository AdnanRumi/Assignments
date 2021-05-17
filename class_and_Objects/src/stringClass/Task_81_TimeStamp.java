package stringClass;

public class Task_81_TimeStamp {

	public static void main(String[] args) {
		
		timeStamp("111111111111");
		
        
      
		
		String time = "11.11.11 11:11:11";
		
		System.out.println(timeStamp(time));

	
	}

	public static String timeStamp(String time) {
		
	

		time = time.replace(".", "").replace(":", "").replace(" ", "");
		
		return time;
		
		

		
		
	}

}
