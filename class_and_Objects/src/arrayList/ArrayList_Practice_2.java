package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayList_Practice_2 {

	public static void main(String[] args) {
		
		ArrayList<String> langs = new ArrayList();
		
		langs.add("Turkish");
		
		langs.add("Zulu");
		
		langs.add("Bosnian");
		
		langs.add("Kurdish");
		
		langs.add("Irish");
		
		System.out.println(langs.get(1));
		
		System.out.println(langs.contains("Kurdish"));
		
		langs.add(3, "Swahili");
		
		langs.add("Armenian");
		
		System.out.println(langs);
		
		System.out.println(langs.size());
		
		langs.remove("Irish");
		
		System.out.println(langs);
		
		langs.add("Irish");
		
		System.out.println("------------------------");
		
	    for(String each: langs) {
	    	
	    	System.out.print(each + " ");
	    }
	    
	    System.out.println("\n-------------------------");
	    
	    for(int i = 0; i < langs.size(); i++) {
	    	
	    	System.out.print(langs.get(i) + " ");	

	    }
	    
	    System.out.println("\n-------------------------");
	    
	    ArrayList<String> langs2 = new ArrayList();
	    
	    langs2.add("Zaza");
	    
	    langs2.add("Amazigh");
	    
	    langs.addAll(langs2);
	    
	    System.out.println(langs);
	    
	    ArrayList<String> langs3 = langs2;
	    
	    System.out.println(langs3);
	    
	    ArrayList<String> langs4 = new ArrayList(langs);
	    
	    System.out.println(langs4);
	    
	    
	    
	    
	    
	    
	    






		
		

	}

}
