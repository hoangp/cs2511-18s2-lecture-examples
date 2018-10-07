package pattern.decorator;

public class Cappuccino extends Beverage {

	public Cappuccino () {
		super.setDescription("Cappuccino");
	}
	public double cost() {
		return 3.00;
	}
}
