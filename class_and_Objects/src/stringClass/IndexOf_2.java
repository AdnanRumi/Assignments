package stringClass;

public class IndexOf_2 {

	public static void main(String[] args) {
		
		String program = "Java & C++ & Python & Tomcat & Eclipse";
		
		boolean b = program.contains("C++");
		
		System.out.println(b);
		
		int a = program.indexOf("C++");
		
		System.out.println(a);
		
		int firstAmp = program.indexOf("&");
		
		System.out.println(firstAmp);
		
		int secondAmp = program.indexOf("&", firstAmp+1);
		
		System.out.println(secondAmp);
		
		int thirdAmp = program.indexOf("&", secondAmp+1);
		
		System.out.println(thirdAmp);
		
		int lastAmp = program.lastIndexOf("&");
		
		System.out.println(lastAmp);
		
		System.out.println(program.charAt(29));
		
		System.out.println(program.charAt(5) + program.charAt(11));
	}

}
