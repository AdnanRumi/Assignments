package arrayList;

import java.util.ArrayList;

public class ArrayList_Practice_1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		
		list.add("books");
		
		list.add("magazines");
		
		list.add("articles");
		
		list.add("newspapers");
		
		list.add("pamphlets");
		
		list.add(1, "encyclopedias");
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(1));
		
		System.out.println(list);
		
		
		
		

	}

}
