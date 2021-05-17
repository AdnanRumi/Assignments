package stringClass;

public class Replace {

	public static void main(String[] args) {
		
		String a = "Moskvitch is the best car ever made.";
		
		String b = a.replace("Moskvitch", "Anadol");
		
		String c = "Velesbit";
		
		String d = "bike";
		
		System.out.println(b);
		
		System.out.println(a);
		
		String e = a.replace("Moskvitch", c).replace("car", d);
		
		System.out.println(e);
		
		
		
		
		String x = "firstName_lastName@gmail.com";
		
		String y = "uji.es"; 
		
		String z = x.replace("gmail.com", "uji.es");
		
		System.out.println(z + "\n" + x);



	}

}
