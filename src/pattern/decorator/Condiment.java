package pattern.decorator;

public abstract class Condiment extends Beverage {

	// Mocha decorator composes the beverage 
	// it needs to decorate
	private Beverage beverage;
	
	public Condiment(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public abstract double cost();
	
	@Override
	public abstract String getDescription();
	
	public void setBeverage(Beverage beverage){
		this.beverage = beverage;
	}
}
