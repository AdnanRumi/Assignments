package class_and_Objects;

public class Contact {
	
	String name;
	
	int phoneNumber;
	
	String emailAddress;
	
	public void call () {
		
		System.out.println("Call " + name + " at " + phoneNumber);
		
	}
		
	public void sendMessage () {
		
	    System.out.println("Send message to " + name + " at " + phoneNumber);	
	}
	
    public void sendEmail () {
    	
    	System.out.println("Send email to " + name + " @ " + emailAddress);
    }
}
