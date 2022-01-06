package b.wrappers;

import java.util.Scanner;

public class Demo1 {
	
public static void main(String[] args) {
	
	int a = 5;				// este es un primitivo
	Integer x = 5;			// este es un objeto
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:"); // en este caso el numero sera un string
	String input = sc.nextLine();
	System.out.println(input);
	
	// parse methods - convert text to numbers - es un metodo de wrappers
	int val = Integer.parseInt(input); 	// parse convierte el String en numero, en 
	System.out.println(val * 2);		// en este caso int (val es int)
	
	
	
	
}
}
