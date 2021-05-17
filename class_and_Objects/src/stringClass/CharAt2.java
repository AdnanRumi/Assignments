package stringClass;

public class CharAt2 {

	public static void main(String[] args) {
		
		String x = "bAbAbAbAbAbAbAbA";
		
		System.out.println(x.charAt(0));
		
		if(x.charAt(0) == 'b') {
			
			System.out.println("The first character is b");
		}else {
			System.out.println("The first character is not b");
		}
		
		String y = "civic";
		
		if(y.charAt(0) == y.charAt(4)) {
			
			System.out.println("The first and last letters are the same");
		
		}else {
			
			System.out.println("The first and last letters are not the same ");
			
		}
	}

}
