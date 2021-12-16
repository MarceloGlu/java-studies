package e;

import java.util.Scanner;

public class DemoFor7Boom {

	public static void main(String[] args) {
		
		//input 2 numbers		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		sc.close(); //close the scanner (save system resources)
		//make sure a is smaller
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//print a and b
		
		System.out.println(a + " - " + b);
	
	
	// print a to be with the rules of 7 Boom
	for (int i = a; i <= b; i++) {
	// add more logic here
		System.out.println();}
	}
}

	
