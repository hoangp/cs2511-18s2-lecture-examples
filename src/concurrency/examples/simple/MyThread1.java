package concurrency.examples.simple;


public class MyThread1 extends Thread {
	
	public void run() {
		System.out.println("MyThread is running");
	}
	
	public static void main(String[] args) {
		MyThread1 aThread = new MyThread1();
		aThread.start();
	}

}
