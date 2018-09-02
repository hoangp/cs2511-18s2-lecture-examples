package pattern.strategy.solution;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying high up in the sky");
	}

}
