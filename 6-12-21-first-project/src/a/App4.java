package a;

public class App4 {

	public static void main(String[] args) {

		// input
		// System.in.read();
		

		// output
		System.out.println("This is an output.");
		
		// assignment
				int x = 15;
				int y = 5;
				System.out.println("X = " + x + " and Y = " + y + ".");
				System.out.println("Is X bigger?");
				

		// if
		if (x > y) {
			System.out.println("Yes, X is bigger.");
		} else {
			System.out.println("No, X is not bigger.");
		}

		// loop
		System.out.println("For an index i that goes from 1 to 10, print all its instances.");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		System.out.println("Well done!");
		System.out.println("END");

	}

}
