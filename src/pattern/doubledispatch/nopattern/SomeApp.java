package pattern.doubledispatch.nopattern;

import java.util.ArrayList;
import java.util.List;

public class SomeApp {
	public static void paintMe(Shape s) {
		Painter p = new Painter();
		p.paint(s);
	}
	
	public static void main(String[] args) {
	
	//1.  Review Method overriding and Polymorphism
		
	List<Graphic> shapes = new ArrayList<Graphic>();
	shapes.add(new Rectangle());
	shapes.add(new Circle());
	shapes.add(new Shape());
	
	// The above code snippet will print the following lines to the console
	// Drawing a rectangle
	// Drawing a circle
	// Drawing a shape
	
	for (Graphic s: shapes) {
		s.draw();
	}
	
	//2. Review Method Overloading
	//   Here, the parameter type passed to the paintMe method ensures that the right overloaded method is invoked
	Painter p = new Painter();
	p.paint(new Circle());
	p.paint(new Shape());
	
	//3. Review Method Overloading does not use polymorphism
	// This will output "Painting a shape"
	// Unfortunately, polymorphism does not work here
    // Why?
	// Compiler uses early (or static) binding for overloaded methods.  
	// So, The issue here is that the method to call was determined statically at compile time 
	// based upon the reference type, not at run-time based upon the object type.  
	// To resolve this issue, another technique is needed � Polymorphic Static Binding.

	Shape s = new Circle();
	p.paint(s);
	
	
	//4. To fix this, use a technique called as double dispatch
	Painter p2 = new Painter();
	
	for (Graphic g: shapes) {
		g.paint(p2);
	}

}
	
}
