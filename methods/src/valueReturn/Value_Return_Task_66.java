package valueReturn;

public class Value_Return_Task_66 {

	public static void main(String[] args) {
		
		double distance1 = distance(99, 4);
		
		System.out.println(distance1);
		
	}
    public static double distance(double speed, double time) {
    	
    	double distance1 = speed * time;
    	
    	return distance1;
    	
    }
}
