package g.random;

public class Demo2 {

	public static void main(String[] args) {
		
		System.out.println((int) (Math.random() * 11));
		
		// x : 0 - 100 inclusive
		int x = (int) (Math.random() * 101);
		int y = (int) (Math.random() * 101);
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		
		//Random is a function that gives an arbitrary number between 0 and almost 1, 0 - 0.999999;
		//by multiplying it I can get different numbers... in the example above we used integers,
		//can be double, etc.
		
		
		
	}

}
