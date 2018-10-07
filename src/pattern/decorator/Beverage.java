package pattern.decorator;

public abstract class Beverage {
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public abstract double cost();
	
}
