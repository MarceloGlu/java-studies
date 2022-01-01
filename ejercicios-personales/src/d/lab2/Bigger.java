package d.lab2;

public class Bigger {

	

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);
		int max = -1;
		
		System.out.println("These are the three randomed numbers: " + a + ", " + b + ", "+ c);

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("The bigger number is: " + max);

}
}
