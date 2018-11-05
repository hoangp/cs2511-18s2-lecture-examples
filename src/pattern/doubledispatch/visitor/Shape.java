package pattern.doubledispatch.visitor;

public class Shape implements Graphic {

	@Override
	public void draw() {
		System.out.println("Drawing a shape");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
