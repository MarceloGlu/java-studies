package converters.currency;

import java.util.*;

public class MyTest {

	private static final Object PI = null;

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter amount in NIS: ");  
		double sh= scanner.nextDouble(); 
		
		
		
		double Dollar = CurrencyConverter.convertNISToDollar(sh);
		
		System.out.printf("The amount in U$D is: %.2f", Dollar);
		// the last line prints the amount in dollars limited to 2 digits
		
		
		scanner.close();
		
		
		

	}

	

}
