package lab7;

import java.util.Iterator;

public class tar3 {
	
	public static void main(String[] args) {
		
		String str = "Sara Shara Shir Sameach";
		char[]arr = str.toLowerCase().toCharArray();
		int c = 0;
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u' ) {
				c++;
			}
		}
		System.out.println("number of vowels: " + c);
	}

}
