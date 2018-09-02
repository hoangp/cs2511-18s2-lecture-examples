package pattern.strategy.solution;
/*
 * This design is flexible.  But it still has one problem.
 * We are doing a poor job of initialising the instance variables inside the constructor
 * We are instantiating a concrete Quack implementation class inside the constructor
 * We will fix this in package pattern.strategy.solution2;
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	void display() {
		System.out.println("I am real Mallard duck");
	}
}
