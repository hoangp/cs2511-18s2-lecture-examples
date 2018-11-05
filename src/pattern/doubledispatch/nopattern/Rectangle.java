package pattern.doubledispatch.nopattern;

public class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}

	
	@Override
	public void paint(Painter p) {
		p.paint(this);
	}

}
