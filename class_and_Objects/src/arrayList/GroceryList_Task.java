package arrayList;

import java.util.Scanner;

public class GroceryList_Task {

	public static void main(String[] args) {
		
		/* Press
	 0 - To print choice options.
	 1 - To print the list of grocery items.
	 2 - To add an item to the list.
	 3 - To modify an item in the list.
	 4 - To remove an item from the list.
	 5 - To search an item from the list.
	 6 - To quit the application.
Enter your choice: */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Press \n0 - To print choice options. \n1 - To print the list of grocery items. \n2 - To add an item to the list. \n3 - To modify an item in the list. \n4 - To remove an item from the list. \n5 - To search an item from the list. \n6 - To quit the application. \nEnter your choice:");
		
		int a = scan.nextInt();
		
		int itemCount = 0;
		
		while(a >= 0 && a <= 6) {
			
			if(a == 0) {
				
				System.out.println("Press \n0 - To print choice options. \n1 - To print the list of grocery items. \n2 - To add an item to the list. \n3 - To modify an item in the list. \n4 - To remove an item from the list. \n5 - To search an item from the list. \n6 - To quit the application. \nEnter your choice:");
				
			}else if(a == 1) {
				
				for(int i = 0; i <= 111; i++) {
					
					System.out.println("You have " + itemCount + " items in your basket");
					
					scan.nextLine();
				}
			}else if(a == 2) {
				
				System.out.println("Please enter your grocery item: ");
				
				String b = scan.nextLine();
				
				for(itemCount = 0; itemCount < 111; itemCount++) {
				
				}else if(a == 3)
			}
			
			
		}
		
	}

}
