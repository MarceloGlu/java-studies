package d;

public class Demo3 {

	/** 
	 * create a random number in the range 0-10,000
	 * print it and print its right digit
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int) (Math.random() * 10001);
		
		System.out.println(x);
		System.out.println(x % 10);
		
		
	}

}
