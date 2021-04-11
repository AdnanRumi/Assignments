package assignment_3_ArithmeticOperators;

public class Question_6 {

	public static void main(String[] args) {
		/* Scientists estimate that roughly 10 grams of caffeine consumed at one time is 
		 * a lethal overdose.
		   Write a program with a variable that holds the number of milligrams of caffeine in 
		   a drink and outputs how many drinks it takes to kill a person.
           Sample Output:
           Number of milligrams in drink: 500
           It would take about 20 drinks for a lethal overdose */
       
		int oneDrinkCaffeine, lethalOverdose, gram;
		
		oneDrinkCaffeine = 500;
		
		gram = 1000;
		
		lethalOverdose = 10 * gram;
		
		System.out.println("In one drink there are " + oneDrinkCaffeine + " milligrams of caffeine");
		
		System.out.println(lethalOverdose + " grams of caffeine is the leathal overdose and is found in average 20 drinks");
		
		
		
		
		
	}

}
