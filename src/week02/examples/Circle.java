package week02.examples;

public class Circle extends Shape {

  private float radius;

  public Circle(String color) {
    super("Circle", color);
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
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
    Circle c2 = (Circle) obj;
    if ((this.color == c2.color) && (this.radius == c2.radius)) {
      return true;
    }
    return false;
  }

}
