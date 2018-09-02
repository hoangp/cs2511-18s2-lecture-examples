package pattern.strategy.original;

public abstract class Duck {
	
	public void swim() {}
	public void quack() {}
	// This method is abstract, since each duck subtype looks different
	// Hence method must be overriden in the duck subtype
	abstract void display();

}
