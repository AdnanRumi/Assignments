package assignment_8_Methods;

public class Q11 {
	
	 public static void main(String[] args) {
		
/* c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a 
 * profit or loss. it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss" */
		 
		c_profits(117, 113);
		 
	}
	 
	 public static void c_profits(int buyPrice, int sellPrice) {
		 
		 if(buyPrice == sellPrice) {
			 
             System.out.println("No loss");	
             
		 }else if(buyPrice > sellPrice) {
			 
			 System.out.println("Loss");
			 
		 }else {
			 
			 System.out.println("Profit");
			 
	
		 }
		
		 
	 }
	 
	 

}
