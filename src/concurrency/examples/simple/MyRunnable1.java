package concurrency.examples.simple;

public class MyRunnable1 implements Runnable {
	private static int counter = 0;
	
	public MyRunnable1(int counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i=0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running: " + counter++);
		}

	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is running");
		int i = 0;
		MyRunnable1 r1 = new MyRunnable1(i);
		Thread threadA = new Thread(r1);
		Thread threadB = new Thread(r1);
		threadA.start();
		threadB.start();
	}

}
