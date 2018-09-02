package principle.lsp;

public class LSPDemo {

	public int doSomething(Rectangle r) {
		r.setHeight(20);
		r.setWidth(3);
		return r.getArea();
		
	}
	
	public static void main(String[] args) {
		
		LSPDemo demo = new LSPDemo();
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Square();
		System.out.println(demo.doSomething(rect1));
		System.out.println(demo.doSomething(rect2));
		
		System.out.println();
		
		
	}
	
}
