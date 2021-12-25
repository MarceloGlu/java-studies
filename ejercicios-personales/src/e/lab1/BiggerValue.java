package e.lab1;

public class BiggerValue {

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		System.out.println("These are the two randomed numbers: " + a + " and " + b);
		System.out.print("And the bigger is...: ");
		if (a>b) {
			System.out.println(a);
			} else System.out.println(b);
		
		

	}

}
