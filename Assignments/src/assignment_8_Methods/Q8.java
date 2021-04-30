package assignment_8_Methods;

public class Q8 {
	
	public static void main(String[] args) {
		
/* Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers 
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input : 2
Output : 1

Input : 9
Output : 21 */
		
		int fiboNth = 9;
        System.out.println(fib(fiboNth));
	}
	
	public static int fib(int fiboNth) {
		
		int num1 = 0;
		
		int num2 = 1;
		
		int num3;
		
		if(fiboNth == 0) 
		
			return num1;
			
			for(int i = 2; i <= fiboNth; i++) {
				
				num3 = num1 + num2;
				
				num1 = num2;
				
				num2 = num3;
			}
			
			return num2;
		
     }
  
  }



