package arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
		int[] grades = {97, 95, 93, 91, 89, 87, 85};
		
		int average = 0;
		
		for(int i = 0; i < grades.length; i++) {
			
			average = average + grades[i];
		}

		System.out.println("Average = " + average / grades.length);

	}

}
