package stringClass;

public class IsEmpty {

	public static void main(String[] args) {
		
		String userName = "";
		
		String password = "";
		
		if(userName.isEmpty()) {
			
			System.out.println("Username field cannot be left empty");
		}else {
			
			System.out.println("Username field is not left empty"); 
		}
        
		if(userName.isEmpty() || password.isEmpty()) {
			
			System.out.println("Username or password fields cannot be left empty");
			
		}else {
			
			System.out.println("Username or password areas are not left empty");
		}
	}

}
