package week02.examples;

public class Rectangle extends Shape {
  protected int width;
  protected int height;

  // Overload constructors
  public Rectangle(String color, int w, int h) {
    // Invoking constructor in the parent class
    super("Rectangle", color);
    System.out.println("Inside four arg rectangle constructor");
    this.width = w;
    this.height = h;
  }

  /* Overloading constructors */
  public Rectangle(String color) {
    // Use this to invoke an overloaded constructor
    this(color, 10, 5);
    System.out.println("Inside two arg rectangle constructor");
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public double getArea() {
    return this.width * this.height;
  }

  @Override
  public String toString() {
    return super.toString() + " and my area is: " + this.getArea();
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == null)
      return false;
    if (this == obj)
      return true;
    Rectangle r2 = (Rectangle) obj;
    if ((this.color == r2.color) && (this.width == r2.width) && (this.height == r2.height)) {
      return true;
    }
    return false;
  }
}
