package d.lab1;

import java.lang.Math;

public class Test {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		System.out.print("The two random numbers requested are: ");
		System.out.println(a + " and " + b + ".");
		System.out.print("The sum of the two numbers is: ");
		System.out.println(a + b);
		System.out.print("The average of the two numbers is: ");
		System.out.println((a + b) / 2 + ".");
		System.out.print("The reminder of each number when divided by 10 is: ");
		System.out.println((a % 10) + " and " + (b % 10) + " respectively.");
		System.out.print("The area of a rectangle where one number is the width and the other the heigth is: ");
		System.out.println(a * b + ".");

	}
}
