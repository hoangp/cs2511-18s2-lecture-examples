package pattern.iterator.solution;
import java.util.Iterator;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;

	public Waitress(Menu pancakeMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		// Integrate the iterator code into the waitress class

		
		System.out.println("MENU\n----\nBREAKFAST");
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		printMenu(pancakeIterator);
		
		System.out.println();
		System.out.println("----\nLUNCH");
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		printMenu(dinerIterator);
				
	}

	private void printMenu(Iterator<MenuItem> dinerIterator) {
		while (dinerIterator.hasNext()) {
			MenuItem menuItem = dinerIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	public static void main(String[] args) {
		Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
		waitress.printMenu();
	}
	
}
