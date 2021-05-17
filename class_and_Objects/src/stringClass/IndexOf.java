package stringClass;

public class IndexOf {

	public static void main(String[] args) {
		
		String a = "Reserve a seat in your heart for everyone.";
		
		int x = a.indexOf("heart");
		
		System.out.println(x);
		
		System.out.println(a.charAt(x + 11));
		
		String y = "Love - Tolerance";
		
		int b = y.indexOf("-");
		
		System.out.println(b);
		
		System.out.println(y.charAt(b - 1));
		
		System.out.println(y.charAt(b + 1));
		
		System.out.println(y.indexOf("-"));


		


	}

}
