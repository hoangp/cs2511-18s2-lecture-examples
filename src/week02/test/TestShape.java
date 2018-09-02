package week02.test;

import week02.examples.Circle;
import week02.examples.Rectangle;
import week02.examples.Shape;

public class TestShape {
	
	/** A polymorphic function that takes in any type of Shape as an argument
	 * @param s - an object instance of type Shape
	 */
	
	public void draw2DShape(Shape s) {
		// does method
	}
	public static void main(String[] args) {
	
		// Example 1 to demonstrate polymorphism and dynamic binding
		// The static type of the array diffShapes is Shape
		
		Shape[] diffShapes = new Shape[3];
		
		// When an object instance is instantiated, each element of the array can point
		// to a sub-class of Shape (different form of Shape)
		diffShapes[0] = new Rectangle("red");
		diffShapes[1] = new Circle("green");
		diffShapes[2] = new Circle("green");

		// Dynamic binding ensures the getArea() in the right sub-class is invoked
		for (int i=0; i< diffShapes.length; i++) {
			System.out.println("Area:" + diffShapes[i].getArea());
		}
		
		// Example 2 - draw2DShape is said to be a polymorphic function, 
		//             as the function draw2DShape can be called with different types of Shape
		
		TestShape test = new TestShape();
		test.draw2DShape(diffShapes[0]);
		test.draw2DShape(diffShapes[1]);	
		
	}

}
