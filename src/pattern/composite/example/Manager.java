package pattern.composite.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager extends Employee {
	
	private List<Employee> employees = new ArrayList<>();
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
			return employees.get(i);
	}


	@Override
	public void print() {
		Iterator<Employee> emps = employees.iterator();
		while (emps.hasNext()) {
			Employee e = emps.next();
			e.print();
		}
	}

}
