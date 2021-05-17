package valueReturn;

public class Task_69 {

	public static void main(String[] args) {
		
		/* A prime number is a number that is evenly divisible only by itself and 1. 
		 * For example, the number 5 is prime number because it can be evenly divided only by 1 and 5. 
		 * The number 6, however, is not prime number because it can be divided evenly by 1,2,3,and 6.
		 * Write a method named isPrime which takes an integer as an argument and returns true if 
		 * the argument is a prime number, or false otherwise.
		 * •Note: 0 and 1 are not prime numbers. 
		 * The 2 is the only even prime number because all the other even numbers can be divided by 2
		 */

//		isPrime(97); 
//		
//		System.out.println(isPrime(199));
//		
//		isPrime(89);
//		
//		System.out.println(isPrime(89));
//		
//		isPrime(19);
//		
//		System.out.println(isPrime(19));
	}

	public static boolean isPrime(int i) {
		
		boolean primes = (i > 1 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0);
		
//		return primes;
		
	}

}
