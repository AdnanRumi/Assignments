package assignment_8_Methods;

public class Q10 {
	
	public static void main(String[] args) {
		
/* isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true  */ 
		
		isEven(111);
		
		
	}
	
	public static int isEven(int num) {
		
		if(num % 2 == 0) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
		}
		
		return num;
	}

}
