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
       
		int caffeineInOneDrink, lethalOverdose, oneGramInMilligrams, numberOfDrinksOverdose;
		
		caffeineInOneDrink = 500;       
		
		oneGramInMilligrams = 1000 ;
		
		lethalOverdose = oneGramInMilligrams * 10; 
		
		numberOfDrinksOverdose = lethalOverdose / caffeineInOneDrink;
		
		System.out.println("In one drink there are " + caffeineInOneDrink + " milligrams of caffeine");
		
		System.out.println(lethalOverdose + " milligrams of caffeine is the leathal overdose and is found in average " + numberOfDrinksOverdose + " drinks");
		
		
		
		
		
	}

}
