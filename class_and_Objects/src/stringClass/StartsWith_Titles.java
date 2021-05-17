package stringClass;

public class StartsWith_Titles {

	public static void main(String[] args) {
		
		String titleAndFullName = "Mrs. Cathie Banos";
		
		String inviteeArrangement = "";
		
		if(titleAndFullName.startsWith("Mrs")) {
			
			System.out.println("Invitee is a married lady.");
		}else if(titleAndFullName.startsWith("Mr")) {
			
			System.out.println("Invitee is a married gentleman.");

		}else if(titleAndFullName.startsWith("Dr")) {
			
			System.out.println("Invitee can be a lady or gentleman.");

		}else if(titleAndFullName.startsWith("Ms")) {
			
			System.out.println("Invitee is an unmarried lady.");
			
		}else {
			
			System.out.println("Invitee can be a lady or gentleman.");

		}
		
		

	}

}
