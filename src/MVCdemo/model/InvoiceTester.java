package MVCdemo.model;

/**
   A program that tests the invoice classes.
*/
public class InvoiceTester
{
   public static void main(String[] args)
   {
      LineItem gameConsole = new Product("Nintendo Switch", 449);
      LineItem discountedGameConsole = new DiscountedItem(gameConsole, 20);
      
      LineItem marioGame = new Product("Mario Kart", 69);
      LineItem pokemonGame = new Product("Pokemon, Let's Go", 59);
      System.out.println(gameConsole);
      System.out.println(marioGame);
      System.out.println(pokemonGame);
      
      Bundle gameBundle = new Bundle("Nintendo Games Bundle");
      gameBundle.add(marioGame);
      gameBundle.add(pokemonGame);
      gameBundle.add(discountedGameConsole);
      System.out.println(gameBundle);

      Bundle consoleBundle = new Bundle("Buy One Switch Get Two Games");
      consoleBundle.add(gameBundle);
      consoleBundle.add(gameConsole);

      System.out.println(consoleBundle);
   }
}
