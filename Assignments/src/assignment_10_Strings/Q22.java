package assignment_10_Strings;

public class Q22 {

	public static void main(String[] args) {
/*  */
		
		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		String requirement = "<html>";
		
		if(html.contains(requirement)) {
			
			System.out.println("myid");
			
		}else {
			
			System.out.println("Invalid input!");
		}

	}

}
