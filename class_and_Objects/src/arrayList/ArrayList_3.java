package arrayList;

import java.util.ArrayList;

public class ArrayList_3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList();
		
		nums.add(1);
		
		nums.add(3);
		
		nums.add(5);
		
		nums.add(7);
		
		System.out.println(nums.size());
		
		System.out.println(nums.get(3));
		
		nums.add(2, 4);
		
		System.out.println(nums.size());
		
		Integer n = 4;
		
		nums.remove(n);
		
		System.out.println(nums.size());

		System.out.println(nums);
		
	}

}
