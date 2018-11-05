package pattern.doubledispatch.visitor;

public class Painter implements Visitor {

	@Override
	public void visit(Shape s) {
		System.out.println("Painting a shape");		
	}
	@Override
	public void visit(Circle c) {
		System.out.println("Painting a circle");		
	}
	@Override
	public void visit(Rectangle r) {
		System.out.println("Painting a rectangle");
	}
	
	public static void main(String[] args) {
		Painter p = new Painter();
		// Calling the appropriate overloaded method
		p.visit(new Circle());		
	}

}
