package pattern.doubledispatch.nopattern;

public class Painter {
	
	public void paint(Shape s) {
		System.out.println("Painting a shape");
	}
	public void paint(Circle c) {
		System.out.println("Painting a circle");
	}
	
	public void paint(Rectangle r) {
		System.out.println("Painting a rectangle");
	}
	
	public static void main(String[] args) {
		Painter p = new Painter();
		// Calling the appropriate overloaded method
		p.paint(new Shape());
		p.paint(new Circle());		
	}
}
