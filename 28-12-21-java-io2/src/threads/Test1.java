package threads;

public class Test1 {
	
public static void main(String[] args) {
		
	MyThread t1 = new MyThread("t1");
		t1.start();
		
		
		
		
		// get a reference to the currently running thread
		Thread currThread = Thread.currentThread();
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println(currThread.getName() + ": " + i);
		}
	}

}


