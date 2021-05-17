package arrays;

import java.util.Arrays;

public class Task_94_PasswordFormation {

	public static void main(String[] args) {
		/* String info1 = "This info is used for creation password : xxxCD132Gxxx . 
		 * Please do not share with anyone";
		 * String info2 = "This info is used for creation password : xxx00ABC!xxx . 
		 * Please do not share with anyone";
		 * Create a password based on given info.
		 * Output: CD132G00ABC! */

		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone";
				 
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone";
		
		String[] password1 = info1.split("xxx");
		
		String[] password2 = info2.split("xxx");
		
		System.out.println(Arrays.deepToString(password1));
		
		System.out.println(Arrays.deepToString(password2));
		
		
		System.out.println("Your password: " + password1[1] + password2[1]);


		
	}

}
