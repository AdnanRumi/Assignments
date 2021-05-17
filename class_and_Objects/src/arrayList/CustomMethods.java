package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
        ArrayList<Integer> list = new ArrayList();
		
		list.add(1); list.add(3); list.add(5); list.add(7); list.add(11);
		
		printList(list);
		
		int sum = sumList(list);
		
		System.out.println("\n"+sum);
		
		ArrayList<Integer> list2 = getList(11);
		
		System.out.println(list2);
		
		ArrayList<Integer> rList = getRandomList(33);
		
		System.out.println(rList);
		
		ArrayList<String> strNums = new ArrayList<>();
		
		strNums.add("1");
		
		strNums.add("3");
		
		strNums.add("7");
		
		strNums.add("11");
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		
		System.out.println(converted);
		
		
	}

	public static int sumList(ArrayList<Integer> x) {
		
		int sum = 0;
		
		for(int each: x) {
			
			sum = sum + each;
		}
		
		return sum;
	}

	public static void printList(ArrayList<Integer> x) {
		
		for(Integer each: x) {
		
		System.out.print(each + " ");
	    }
	}
	
	public static ArrayList<Integer> getList(int x) {
		
		ArrayList<Integer> y = new ArrayList();
		
		for(int i = 1; i <= x; i++) {
			
		   y.add(i); 
			
		}
		
		   return y;

	}
	
	public static ArrayList<Integer> getRandomList(int x) {
		
		Random rndm = new Random();
		
		ArrayList<Integer> y = new ArrayList();
		
		for(int i = 1; i <= x; i++) {
			
			y.add(rndm.nextInt(111));
		}
		
		return y;
		
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> x) {
		
		ArrayList<Integer> y = new ArrayList<>();
		
		for(String each: x) {
			
			y.add(Integer.parseInt(each));
		}
		
		return y;
	}
	
	
	
	

}
