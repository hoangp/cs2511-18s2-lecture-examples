package pattern.doubledispatch.visitor;

public interface Visitor {
	public void visit(Shape s);
	
	public void visit(Circle c);
	
	public void visit(Rectangle r);
	
}
