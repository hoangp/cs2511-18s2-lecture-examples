package pattern.iterator.original;

import java.util.ArrayList;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress() {
		this.pancakeHouseMenu = new PancakeHouseMenu();
		this.dinerMenu = new DinerMenu();
	}
 
	public void printMenu() {
		// To print all the items in the menu, you need to call getMenuItems() on each menu
		// Each call to getMenuItems() returns a different type
		// Then implement two different loops to step through menu items of each menu
		// What if a third cafe needs to be merged?  Three loops?

		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		
		System.out.println("MENU\n----\nBREAKFAST");
		for (int i=0; i<=breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		for (int i=0; i< lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	
 
 
}
