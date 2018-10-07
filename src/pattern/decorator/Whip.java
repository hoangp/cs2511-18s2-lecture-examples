package pattern.decorator;

public class Whip extends Beverage {

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whipped";
	} 
	
	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
