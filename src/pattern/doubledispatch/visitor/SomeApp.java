package pattern.doubledispatch.visitor;

import java.util.ArrayList;
import java.util.List;

public class SomeApp {
	public static void paintMe(Shape s) {
		Painter p = new Painter();
		p.visit(s);
	}
	
	public static void main(String[] args) {
	
	//1.  Review Method overriding and Polymorphism
		
	List<Graphic> shapes = new ArrayList<Graphic>();
	shapes.add(new Rectangle());
	shapes.add(new Circle());
	shapes.add(new Shape());
	
	
	// class Painter is implemented using the visitor pattern, that uses the double dispatch technique
	// class Painter is a visitor, which is passed to the accept() method in each Graphic class
	Painter p = new Painter();
	
	for (Graphic g: shapes) {
		g.draw();  // Direct use of polymorphism
		g.accept(p); // The graphic class takes in a visitor, in this case which is a Painter
	
	}

}
	
}
