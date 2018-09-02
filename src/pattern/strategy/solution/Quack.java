package pattern.strategy.solution;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can quack loud and clear");
	}

}
