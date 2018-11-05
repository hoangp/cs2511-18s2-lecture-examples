package concurrency.examples.simple;


public class Counter implements Runnable {

	 private static int counter = 0;
	 
	 public Counter() {}
	 public Counter(int counter) {
	        this.counter = counter;
	  }

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + counter++);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// A simple program that prints out the name of the thread executing the main() thread.
		// This thread is assigned by the JVM
		System.out.println(Thread.currentThread().getName());
				
		Runnable r1 = new Counter(counter);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		System.out.println("First thread: "  + t1.getName());
		System.out.println("Second thread: " + t2.getName());
		t1.start();  t2.start();  
	}
}


