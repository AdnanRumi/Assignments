package assignment_8_Methods;

public class Q13 {
	
	public static void main(String[] args) {
		
	/* This method calculates a water bill, the method gets a double and returns a double.
		The more water you use the more it will cost you (as a fine for wasting water).
		for example:
		waterTax(50)
		returns 30
		waterTax(55)
		returns 49.5
		waterTax(101)
		returns 140.9
		waterTax(151)
		returns 235.9
		the regular calculation under 50 is
		bill = units * 0.60;
		above 50 is:
		bill = units * 0.90;

 above 100 the calculation is like above 50 but with a 50 as fine and above 150 it is the 
		same as above 50 (units *0.90) but with a 100 fine added to the price. */  
		
		
	
		
		System.out.println(waterBill(101));
	}
	
	public static double waterBill(double usage) {
		
		double waterbill, parameter = 0;
				
		if(usage < 50) {
			
			parameter = 0.6;
			
			return waterbill = usage * parameter;
			
		}else if(usage < 100) {
			
			parameter = 0.9;
			
			return waterbill = usage * parameter;

		}else if(usage < 150) {
			
			parameter = 0.9;
			
			int fine = 50;
			
			return waterbill = usage * parameter + fine;
			
		}else {
			
			parameter = 0.9;
			
			int fine = 100;
			
			return waterbill = usage * parameter + fine;
			
		}
		
	
		
	}

}
