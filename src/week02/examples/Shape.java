package week02.examples;
/* Base class Shape that stores name of the shape and color
 *  
 */
public class Shape {
	
	protected String name;
	protected String color;
	protected double  area;

	public Shape(String name, String color) {
		System.out.println("Inside the shape constructor");
		this.name = name;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * Getter and setter methods for area
	 * Only getter method defined
	 * No setter method defined for area, as area is derived from the dimensions of the shape.
	 * These dimensions are set when the particular shape object is instantiated
	 */
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "I am a " + name + " and my color is: " + this.getColor();
	}
	
}
