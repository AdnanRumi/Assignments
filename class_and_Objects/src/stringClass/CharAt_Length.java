package stringClass;

public class CharAt_Length {

	public static void main(String[] args) {
		
		String a = "CIVIC";
		
		int x = a.length();
		
		if(a.charAt(0) == a.charAt(x-1)) {
			
			System.out.println("The first and last letters are the same");
			
		}else {
			
			System.out.println("The first and last letters are not the same ");

		}
		
		

	}

}
