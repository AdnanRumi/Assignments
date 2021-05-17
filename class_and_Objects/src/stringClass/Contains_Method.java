package stringClass;

public class Contains_Method {

	public static void main(String[] args) {
	
		String a = "Reserve a seat in your heart for everyone.";
		
		boolean x = a.contains("heart");
		
		System.out.println(x);
		
		String str = "BeSoTolerantThatYourBosomBecomeWideLikeTheOcean.";
		
		boolean y = str.contains("Tolerant");
				
		String b = a.concat(str);
		
		System.out.println(b.contains("heart") && b.contains("Compassion"));
		
		String c = "Bethechangeyouwanttoseeintheworld.";
		
		System.out.println(c.concat(str).concat(a));
		
		System.out.println();
		
		
		
		

	}

}
