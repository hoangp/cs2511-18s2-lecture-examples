package pattern.decorator;

public class StarBuzzCoffee {
	
	public static void main(String[] args) {
		Beverage b1 = new Cappuccino();
		
		System.out.printf
		("Cost of %s is: %.2f \n", b1.getDescription(), b1.cost());
		
		Beverage b2 = new Cappuccino();
		
		// Add mocha
		b2 = new Mocha(b2);
		
		// Add whipped
		b2 = new Whip(b2);
		System.out.printf
		("Cost of %s is: %.2f \n", b2.getDescription(), b2.cost());
	}
}
