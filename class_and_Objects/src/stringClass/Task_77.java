package stringClass;

public class Task_77 {

	public static void main(String[] args) {
		
		String str = ";9 ";
		
		char a = ':';
				
		char b = ';';
		
		char c = ')';
		
		char d = '(';
		
		char e = '/';
		
		char f = 'p';
		
		char g = '0';
		
//		Create a emoji program:
//		1-Check if emoji has 2 characters. 
//		If it is not, print “invalid emoji” 2-Valid emojis:
//		Starting with := > :)Smile,:(Sad,:/Upset,:pPlayful,Otherwise invalid
//		Starting with ; = > ;)Wink, ;0 Surprised, Otherwise invalid

		if(str.length() < 1 || str.length() > 2) {
			
			System.out.println("Invalid emoji"); return;
			
		}else {
			if(str.charAt(0) != a || str.charAt(0) != b) {
				
				if(str.charAt(1) == c ||  str.charAt(1) == d || str.charAt(1) == e || str.charAt(1) == f || str.charAt(1) == g) {
					
					System.out.println("Valid emoji");
					
	
				}else {
					
					System.out.println("Invalid emoji");
				}
				
			}
		}
	}

}
