package pattern.decorator;

public class Mocha extends Condiment {
	
	// Mocha decorator composes the beverage 
	// it needs to decorate
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		super(beverage);
//		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + 0.50; 
	}
}
