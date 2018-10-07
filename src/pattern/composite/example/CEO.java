package pattern.composite.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CEO extends Employee {

	private List<Employee> directReports = new ArrayList<Employee>();
	private double budget;
	
	public CEO(String name, double salary, double budget) {
		super(name, salary);
		this.budget = budget;
	}

	@Override
	public void add(Employee employee) {
		directReports.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		directReports.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
			return directReports.get(i);
	}

	@Override
	public void print() {
		Iterator<Employee> emps = directReports.iterator();
		while (emps.hasNext()) {
			Employee e = emps.next();
			e.print();
		}
	}
}
