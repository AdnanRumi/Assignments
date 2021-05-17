package arrayList;

import java.util.ArrayList;

public class RemoveAll_Method {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		list.add(1); list.add(3); list.add(5); list.add(7); list.add(11);
		
		ArrayList<Integer> list2 = new ArrayList();
		
		list2.add(11); list2.add(13); list2.add(17); list2.add(33);
		
		System.out.println(list); System.out.println(list2);
		
		list.removeAll(list2);
		
		System.out.println(list); System.out.println(list2);



		
		

	}

}
