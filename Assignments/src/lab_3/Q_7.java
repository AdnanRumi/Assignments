package lab_3;

public class Q_7 {

	public static void main(String[] args) {
		/* Given 2 strings, a and b, return a string of the form short+long+short, 
		 * with the shorter string on the outside and the longer string on the inside. 
		 * comboString("Hello", "hi") → "hiHellohi"
		 * comboString("hi", "Hello") → "hiHellohi"
		 * comboString("aaa", "b") → "baaab" */
		
		String a = "Love";
		
		String b = "Compassion";
		
		if(a.length() > b.length()) {
		
		    System.out.println(b + a + b);
		
		}else if(b.length() > a.length()) {
			
			System.out.println(a + b + a);
			
		}
		
		

	}

}
