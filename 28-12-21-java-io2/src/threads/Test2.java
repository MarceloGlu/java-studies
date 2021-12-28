package threads;

public class Test2 {
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		MyThread t4 = new MyThread("t4");
		MyThread t5 = new MyThread("t5");
		
		Thread[] threads = {t1, t2, t3, t4, t5};
		{for (Thread t : threads) {
		t.start();}
		
		
		
		
		// get a reference to the currently running thread
		Thread currThread = Thread.currentThread();
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println(currThread.getName() + ": " + i);
		}
	}

}
}
