package concurrency.examples.simple;


public class GreetingProducer implements Runnable {

	private final int count = 5;
	private final int DELAY = 100;
	private String greeting;
	
	public GreetingProducer(String aMsg){
		this.greeting = aMsg;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=count; i++) {
			System.out.println(i + ":" + greeting);
			}
		
	}
	
	public static void main(String[] args) {
		Runnable r1 = new GreetingProducer("Hello, World!");
		Runnable r2 = new GreetingProducer("Bonjour!");
		
	    Thread t1 = new Thread(r1);
	    Thread t2 = new Thread(r2);
	    
	    t1.start();
	    t2.start();
	    
	}

}
