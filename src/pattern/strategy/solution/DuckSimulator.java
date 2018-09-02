package pattern.strategy.solution;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		// Change flying behavior of mallard duck instance
		FlyBehavior newBehaviour = new FlyRocketPowered(); 
		newBehaviour = new FlyNoWay();
		mallard.setFlyBehavior(newBehaviour);
		mallard.performFly();
	}
}
