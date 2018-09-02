package week02.test;

import week02.examples.Rectangle;

public class TestRectangle {
	
public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle("blue",5,10);
		Rectangle r2 = new Rectangle("blue",5,10);
		Rectangle r3 = new Rectangle("blue");
		
		//Invoking toString() 
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		//Testing equality of rectangles
		if (r1.equals(r2)) {
			System.out.println("r1 and r2 are same");
		}
		else
			System.out.println("r1 and r2 are different");
		
		if (r1.equals(r3)) {
			System.out.println("r1 and r3 are same");
		}
		else
			System.out.println("r1 and r3 are different");	
   }
}
