package pattern.strategy.solution;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// Cannot fly at all.  Implementation for all ducks that cannot fly
		System.out.println("I simply can't fly, but i suppose i could try to glide!!");
	}

}
