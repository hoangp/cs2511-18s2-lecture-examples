package week02.test;
import week02.examples.Point;

public class PointTest {
public static void main (String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1.equals(p2));
		Object p3 = p2;
		System.out.println(p3.equals(p1));
	}

}
