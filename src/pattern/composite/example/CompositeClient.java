package pattern.composite.example;

public class CompositeClient {

	
	public static void main(String[] args) {

		
		  Employee ceo = new CEO("Smith", 150000, 1_000_000);
		  
		  Employee emp1=new Developer("John", 10000);
		  Employee emp2=new Developer("David", 15000);
		  
		  Employee manager1=new Manager("Daniel",25000);
		  
		  manager1.add(emp1);
		  manager1.add(emp2);
		  
		  Employee emp3=new Developer("Michael", 20000);
		  ceo.add(emp3);
		  ceo.add(manager1);
		  ceo.print();
		  
	}
}
