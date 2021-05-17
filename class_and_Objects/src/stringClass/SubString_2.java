package stringClass;

public class SubString_2 {

	public static void main(String[] args) {
		
		String str1 = "{{}}";
		
		String str2 = "PEACE*LOVE*COMPASSION";
		
		String str3, str4;
		
		str3 = str1.substring(0, 2);
		
		str4 = str1.substring(2);
		
		System.out.println(str3 + str2 + str4);
		
		System.out.println(str2.toLowerCase());
	}

}
