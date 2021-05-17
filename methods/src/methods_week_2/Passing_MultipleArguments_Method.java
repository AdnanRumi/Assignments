package methods_week_2;

public class Passing_MultipleArguments_Method {

	public static void main(String[] args) {
		
		totalSum(33,49);
		
		totalSum(7,11);
		
		totalSum(111,89);
		
		totalSum(333,479);
		
		totalSum(313,149);

	}

	public static void totalSum(int i, int j) {
		
		int sum = i+j;
		
		System.out.println("The total sum is " + sum);
		
	}

}
