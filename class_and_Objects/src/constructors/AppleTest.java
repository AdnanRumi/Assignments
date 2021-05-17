package constructors;

public class AppleTest {

	public static void main(String[] args) {
		ApplePassingObjectsAsArguments apple = new ApplePassingObjectsAsArguments();
				
		changeColor(apple);
		
		System.out.println(apple.color);
		
		System.out.println(methodObject().color);

		
		

	}
	
	public static void changeColor(ApplePassingObjectsAsArguments x) {
		
		x.color = "Red";
	}
	
	public static ApplePassingObjectsAsArguments methodObject() {
		
		ApplePassingObjectsAsArguments apple2 = new ApplePassingObjectsAsArguments();
		
		return apple2;
	}

}
