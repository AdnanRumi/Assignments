package methods_week_2;

public class PassingArguments_Task_59_Method {

	public static void main(String[] args) {
		
		payRoll(160, 30.50);
		
		payRoll(140, 50);
		
		payRoll(120, 50);
		
		payRoll(100, 60);
		
		payRoll(40, 150);
	

	}

	public static void payRoll(int hours, double hourlyPay) {
		
		double pay = hours * hourlyPay;
		
		System.out.println("The monthly pay is " + pay);
		
		
	}

}
