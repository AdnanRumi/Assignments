package stringClass;

public class Task_80 {

	public static void main(String[] args) {
		
		/* Write a method that accepts 2 strings(str1,str2)  and prints the position index of 
		 * the str2 if str2 is existing in str1.If it doesn’t exist, print “not found”
		 * checkedString(“Your order confirmation number is XYZ”,  “confirmation”) ; */
		
		quotes("Yesterday I was smart and I wanted to change the world, today I am wise and "
				+ "I want to change myself. Rumi", "If you want to change the world, start working with yourself first.");
      
		String str1 = "Yesterday I was smart and I wanted to change the world, today I am wise and "
				+ "I want to change myself. Rumi";
		
		String str2 = "If you want to change the world, start working with yourself first.";
		
		
				
	}
	
  public static void quotes(String str1,String str2) {
	  
	  if(str1.contains("change the world")) {
			
			System.out.println("Position of \"change the world\": " + str1.indexOf("change the world"));
		
		}else {
			
			System.out.println("Not found");
		}
  }
}
