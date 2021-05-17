package overLoading;

public class MethodOverloading_1 {

	public static void main(String[] args) {
	
		System.out.println(total(11, 17));
		
		System.out.println(total(11, 33, 71));
		
		System.out.println(total(111, 123, 219));

	}
    
	public static int total(int i) {
		
		return i;
	} 
	
	public static int total(int i, int j) {
		
		return i + j;
	}
    public static int total(int i, int j, int k) {
		
    	return i + j + k;
		
	}

}
