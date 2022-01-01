package lab2;

public class RanNum2 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 100);
		System.out.println("The randomed number is " + n + ".");

		if (n <= 50) {System.out.println("Small!");}
		else {System.out.println("Big!");}

		if (n % 2 == 0) {
			System.out.println("Even.");
		} else
			System.out.println("Odd.");

	}
}
