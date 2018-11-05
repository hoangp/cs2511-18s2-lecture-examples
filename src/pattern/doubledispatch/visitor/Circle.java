package pattern.doubledispatch.visitor;

public class Circle extends Shape {
	

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
