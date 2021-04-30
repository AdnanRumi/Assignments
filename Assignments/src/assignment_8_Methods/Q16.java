package assignment_8_Methods;

import java.util.Scanner;

public class Q16 {
	
	public static void main(String[] args) {
		
/* To book a room first it needs to be available for rent and make sure its available at 
 * the date selected: the room is already booked between 7/1/2018 - 7/8/2018 and not 
 * available accepting bookings only for year of 2018
example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false */
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter date: ");
		
		String date = scan.nextLine();
		
		boolean availabilityRoom = true;
		
		boolean rooms = bookingARoom(availabilityRoom,date);
		
		System.out.print(availabilityRoom);
		System.out.println(" " + bookingARoom(rooms, date) + " " + date);
	}
	
	public static boolean bookingARoom(boolean room, String bookingDate) {
		
		
		
		if(bookingDate.substring(4).equals("2018")) {
			
			if(room) {
				
			  if(bookingDate.substring(0, 3) != "7/1" && bookingDate.substring(0, 3) != "7/2" && bookingDate.substring(0, 3) != "7/3" && bookingDate.substring(0, 3) != "7/4" && bookingDate.substring(0, 3) != "7/5" && bookingDate.substring(0, 3) != "7/6" && bookingDate.substring(0, 3) != "7/7" && bookingDate.substring(0, 3) != "7/8") {
				  
				 
			  }
			}
			 return true;

	    }else 
	    	return false;
		
		
	}

}
