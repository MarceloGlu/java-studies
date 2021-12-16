package e;

import java.util.Scanner;

public class Demo1WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int c = 1;
		while(c <= 10) {
			System.out.println(c);
			c++;
		}*/
		
		//Scanner sc = new Scanner(System.in)
		//int input = sc.nextint():
		//sc.close
		
		Scanner sc = new Scanner(System.in);
		
		int password = 123;
		System.out.print("enter a password: ");
		int input = sc.nextInt();		
		int counter = 1;
		
		while(input!=password) {
			System.out.print("wrong password, try again: ");
			input = sc.nextInt();
			counter = counter +1;
			
		}
		sc.close();
		System.out.println("your are logged in");

	}

}
