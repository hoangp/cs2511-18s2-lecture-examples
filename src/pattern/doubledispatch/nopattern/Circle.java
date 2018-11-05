package pattern.doubledispatch.nopattern;

public class Circle extends Shape {
	

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	public void paint(Painter p) {
		p.paint(this);
	}

}
