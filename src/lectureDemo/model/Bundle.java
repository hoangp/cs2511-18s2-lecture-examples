package lectureDemo.model;

import java.util.ArrayList;

/**
   A bundle of line items that is again a line item.
*/
public class Bundle implements LineItem
{
   private ArrayList<LineItem> items;
   String description;

    public String getDescription() {
        return description;
    }

    /**
      Constructs a bundle with no items.
   */
   public Bundle(String description)
   {
       this.description = description;
       items = new ArrayList<LineItem>();
   }

   /**
      Adds an item to the bundle.
      @param item the item to add
   */
   public void add(LineItem item)
   {
       items.add(item);
   }

   public double getPrice()
   {
      double price = 0;

      for (LineItem item : items)
         price += item.getPrice();
      return price;
   }

   public String toString()
   {
      StringBuffer sb = new StringBuffer(description).append("{");
      for (LineItem item: items) {
    	  sb.append(item + " ");
       }
      return sb.toString();
   }

}
