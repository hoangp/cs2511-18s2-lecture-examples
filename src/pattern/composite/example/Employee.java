package pattern.composite.example;

public abstract class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() { 
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void add(Employee employee) {}
	public void remove(Employee employee) {}
	public Employee getChild(int i) { return null; }
	
	public void print() {
		System.out.println("-------------");
	    System.out.println("Name ="+getName());
	    System.out.println("Salary ="+getSalary());
	    System.out.println("-------------");
	}

}
