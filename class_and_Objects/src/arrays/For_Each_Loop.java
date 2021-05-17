package arrays;

public class For_Each_Loop {

	public static void main(String[] args) {
		
       String[] bookGenres = {"research", "adventure", "fiction", "romance"};
       
       for(String books: bookGenres) {
    	   
    	   System.out.println(books);  
    	   
       }
       
       System.out.println("**************************");
       
       for(int i = 0; i < bookGenres.length; i++) {
    	   
    	   System.out.println(bookGenres[i]);
       }
       
       System.out.println("**************************");

       
       for(int i = (bookGenres.length-1); i >= 0; i--) {
    	   
    	   System.out.println(bookGenres[i]);

    	   
    	   
       }

	}
	

}
