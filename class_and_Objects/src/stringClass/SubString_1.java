package stringClass;

public class SubString_1 {

	public static void main(String[] args) {
		
       String str = "Reserve a seat_in your heart for everyone.";
       
       System.out.println(str.substring(10));
       
       System.out.println(str.substring(str.length()-9));
       
       System.out.println(str.substring(15));
       
       System.out.println(str.substring(0, 14));
       
       System.out.println(str.substring(2, 14));
       
       System.out.println(str.substring(2, 15));
       
       System.out.println(str.substring(14, 14));
       
       System.out.println(str.substring(5, str.length()-5));




	}

}
