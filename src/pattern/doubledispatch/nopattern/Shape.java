package pattern.doubledispatch.nopattern;

public class Shape implements Graphic {

	@Override
	public void draw() {
		System.out.println("Drawing a shape");
	}

	@Override
	public void paint(Painter p) {
		p.paint(this);
	}
	
	
}
