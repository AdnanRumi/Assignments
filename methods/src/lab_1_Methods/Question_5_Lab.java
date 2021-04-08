package lab_1_Methods;

public class Question_5_Lab {

	public static void main(String[] args) {
	
			
		drivingFast(55, false);
		
		drivingFast(65, true);
		
		drivingFast(89, false);
		
		drivingFast(83, true);

	}

	public static void drivingFast(int speed, boolean birthday) {
		
		
		if(speed <= 60 && !birthday) {
			
			System.out.println("Speed " + speed + ": Not birthday, 0 = no ticket");
			
		}else if (speed <= 80 && !birthday) {
			
			System.out.println("Speed " + speed + ": Not birthday, 1 = small ticket");	
			
		}else if(speed > 80 && !birthday) {
			
			System.out.println("Speed " + speed + "; Not birthday, 2 = big ticket");

		}else if(speed <= 65 && birthday) {
			
			System.out.println("Speed " + speed + ": Birthday, 0 = no ticket");
			
		}else if(speed <= 85 && birthday) {
			
			System.out.println("Speed " + speed + ": Birthday, 1 = small ticket");

		}else if(speed > 85 && birthday) {
			
			System.out.println("Speed " + speed + ": Birthday, 2 = big ticket");

		  }
		
	   }
		
	}


