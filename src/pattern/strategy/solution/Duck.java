package pattern.strategy.solution;

public abstract class Duck extends Test {
	
	// Every duck has a reference to another object that implements the FlyBehavior interfaces
	protected FlyBehavior flyBehavior;
	// Every duck has a reference to another object that implements the QuackBehavior
	protected QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("All ducks float, even rubber ducks and decoy ducks....");
	}
	// This method is abstract, since each duck subtype looks different
	// Hence method must be overriden in the duck subtype
	abstract void display();
	
	// The duck object now delegates the quack behavior to the object referenced by the quackBehavior
	public void performQuack() {
		quackBehavior.quack();
	}
	// The duck object now delegates the fly behavior to the object referenced by the flyBehavior
	public void performFly() {
		flyBehavior.fly();
	}
	
	// Add setter methods to enable change of behavior at run-time
	public void setFlyBehavior(FlyBehavior f) {
		this.flyBehavior =f ;
	}
	public void setQuackBehavior(QuackBehavior q) {
		this.quackBehavior = q;
	}

}
