package threads;

public class Test3 {
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		
		t1.start();
		t2.start();
		
		
	}

}
