package lab2;

public class Smaller {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);
		int min = -1;

		System.out.println("These are the three randomed numbers: " + a + ", " + b + ", " + c);

		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("The smaller number is: " + min);

	}
}
