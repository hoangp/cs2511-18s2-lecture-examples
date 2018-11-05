package pattern.doubledispatch.visitor;

public class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
