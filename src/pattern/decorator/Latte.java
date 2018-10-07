package pattern.decorator;

public class Latte extends Beverage {

	public Latte () {
		super.setDescription("Latte");
	}
	public double cost() {
		return 3.50;
	}

}
