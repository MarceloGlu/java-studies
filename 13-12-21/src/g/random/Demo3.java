package g.random;

public class Demo3 {

	/** 
	 * create a random number in the range 0-10,000
	 * print it and print its right digit
	 * */
	
	public static void main(String[] args) {
		
		
		int x = (int) (Math.random() * 10001);
		
		System.out.println(x);
		System.out.println(x % 10);
		
		
	}

}
