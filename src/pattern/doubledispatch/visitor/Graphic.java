package pattern.doubledispatch.visitor;

public interface Graphic {
	void draw();
	public abstract void accept(Visitor visitor);
}
