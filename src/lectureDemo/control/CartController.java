package lectureDemo.control;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import lectureDemo.model.Bundle;
import lectureDemo.model.DiscountedItem;
import lectureDemo.model.LineItem;
import lectureDemo.model.Product;

import java.util.ArrayList;

public class CartController extends Controller {

    private static final int N_PRODUCTS = 5;

    @FXML
    private Label console;

    @FXML
    private Label mario;

    @FXML
    private Label pokemon;

    @FXML
    private Label bundleGames;

    @FXML
    private Label bundleConsole;

    @FXML
    private RadioButton sel1;

    @FXML
    private RadioButton sel2;

    @FXML
    private RadioButton sel3;
    @FXML
    private RadioButton sel4;
    @FXML
    private RadioButton sel5;



    @FXML
    private TextField field1;

    @FXML
    private TextField field2;
    @FXML
    private TextField field3;
    @FXML
    private TextField field4;
    @FXML
    private TextField field5;

    @FXML
    private Label currSelection;
    
    private ToggleGroup group;

    private int quantity[];
    private ArrayList<LineItem> items;
    private boolean keyConfigured;

    public CartController(Stage s) {
        super(s);
        this.items = new ArrayList<>();
        this.quantity = new int[5];
        keyConfigured = false;
    }


    @FXML
    public void initialize() {
        Product nintendoSwitch = new Product("Nintendo Switch", 449);
        Product superMario = new Product("Super Mario", 69);
        Product pokemonGo = new Product("Pokemon, Let's Go",59);
        Bundle gamesBundle = new Bundle("Two Games Bundle");
        gamesBundle.add(superMario);
        gamesBundle.add(pokemonGo);
        Bundle gameConsoleBundle = new Bundle("Buy one Switch with 60% off games");
        gameConsoleBundle.add(gamesBundle);
        gameConsoleBundle.add(nintendoSwitch);
        DiscountedItem gameBundleDiscount = new DiscountedItem(gamesBundle, 0.4);
        DiscountedItem consoleDiscount = new DiscountedItem(gameConsoleBundle, 0.6);
        items.add(nintendoSwitch); //0
        items.add(superMario);  //1
        items.add(pokemonGo);  //2
        items.add(gameBundleDiscount);  //3
        items.add(consoleDiscount);  //4

        console.setText("Nintendo Switch: $" + nintendoSwitch.getPrice());
        console.setFont(new Font("Arial", 20));
        mario.setText("Super Mario: $" + superMario.getPrice());
        mario.setFont(new Font("Arial", 20));
        pokemon.setText("Pokemon, Let's Go: $"+pokemonGo.getPrice());
        pokemon.setFont(new Font("Arial", 20));
        bundleGames.setText("Discount Game Pack(Mario + Pokemon): $" + gameBundleDiscount.getPrice());
        bundleGames.setFont(new Font("Arial", 20));
        bundleConsole.setText("Buy one Switch with 60% off games: $" + consoleDiscount.getPrice());
        bundleConsole.setFont(new Font("Arial", 20));

        showQuantities();
        group = new ToggleGroup();
        sel1.setToggleGroup(group); sel1.setUserData(1);
        sel2.setToggleGroup(group);sel2.setUserData(2);
        sel3.setToggleGroup(group);sel3.setUserData(3);
        sel4.setToggleGroup(group);sel4.setUserData(4);
        sel5.setToggleGroup(group);sel5.setUserData(5);
        
        currSelection.setText("");
    }

    private String generateStatement() {
        String statement;
        double sum = 0;
        StringBuilder statementBuilder = new StringBuilder();
        for(int i = 0; i < N_PRODUCTS; i++) {
            if (quantity[i] != 0) {
                LineItem tmp = items.get(i);
                double price = tmp.getPrice() * quantity[i];
                statementBuilder.append(tmp).append(" $").append(tmp.getPrice()).append(" x ")
                                .append(quantity[i]).append(" = $").append(price).append("\n");
                sum += price;
            }
        }
        statement = statementBuilder.toString();

        if (sum != 0) {
            statement += ("Total Price is $"+sum + ".\nThank you!\n");
        } else {
            statement += "No item selected!\nThank you!\n";
        }

        return statement;
    }
    
    @FXML
    public void handleCalculateButton() {
        Screen invoice = new Screen(super.getS(), "Invoice", "lectureDemo/view/invoice.fxml");
        InvoiceController invoiceController = new InvoiceController(super.getS(), generateStatement());
        invoice.start(invoiceController);
    }

    @FXML
    public void radioSelected(ActionEvent event) {
    	
    	Node node = (Node) event.getSource();
    	Scene currentScene = node.getScene();
    	
    	EventHandler<KeyEvent> ke = new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				KeyCode key = event.getCode();
				if (key.equals(KeyCode.W)) {
					handlePlus();
				}
				else if (key.equals(KeyCode.S)) {
					handleMinus();
				}
			}
		};
		currentScene.setOnKeyPressed(ke);
		
//        if (!keyConfigured) {
//            currSelection.getScene().setOnKeyReleased(new EventHandler<KeyEvent>() {
//                @Override
//                public void handle(KeyEvent event) {
//                    KeyCode key = event.getCode();
//                    if (key.equals(KeyCode.W)) {
//                        handlePlus();
//                    } else if (key.equals(KeyCode.S)) {
//                        handleMinus();
//                    }
//                }
//            });
//            keyConfigured = true;
//        }
         
		if (sel1.isSelected()) {
            updateQuantity(0);
            currSelection.setText("Nintendo Switch selected");
        } else if (sel2.isSelected()) {
            updateQuantity(1);
            currSelection.setText("Super Mario selected");
        } else if (sel3.isSelected()) {
            updateQuantity(2);
            currSelection.setText("Pokemon selected");
        } else if (sel4.isSelected()) {
            updateQuantity(3);
            currSelection.setText("Discount games selected");
        } else if (sel5.isSelected()) {
            updateQuantity(4);
            currSelection.setText("Buy one switch with discounted games selected");
        }
    }
    
    private void updateQuantity(int i) {
        if (i < 0) return;
        for (int j = 0; j < N_PRODUCTS; j++) {
            quantity[j] = (j==i)? 1 : 0;
        }
        showQuantities();
    }

    private void showQuantities() {
        field1.setText(String.valueOf(quantity[0]));
        field2.setText(String.valueOf(quantity[1]));
        field3.setText(String.valueOf(quantity[2]));
        field4.setText(String.valueOf(quantity[3]));
        field5.setText(String.valueOf(quantity[4]));
    }

   @FXML
   public void handlePlus() {
	   int index = (int)group.getSelectedToggle().getUserData();
	   System.out.println("index:" + index);
	   
	   
        if (sel1.isSelected()) {
            quantity[0] += 1;
            field1.setText(String.valueOf(quantity[0]));
        } else if (sel2.isSelected()) {
           quantity[1] += 1;
           field2.setText(String.valueOf(quantity[1]));
        } else if (sel3.isSelected()) {
           quantity[2] += 1;
           field3.setText(String.valueOf(quantity[2]));
        } else if (sel4.isSelected()) {
           quantity[3] += 1;
           field4.setText(String.valueOf(quantity[3]));
        } else if (sel5.isSelected()) {
           quantity[4] += 1;
            field5.setText(String.valueOf(quantity[4]));
        }
   }

    @FXML
    public void handleMinus() {
        if (sel1.isSelected()) {
            if (quantity[0] > 0) quantity[0] -= 1;
            field1.setText(String.valueOf(quantity[0]));
        } else if (sel2.isSelected()) {
            if (quantity[1] > 0) quantity[1] -= 1;
            field2.setText(String.valueOf(quantity[1]));
        } else if (sel3.isSelected()) {
            if (quantity[2] > 0) quantity[2] -= 1;
            field3.setText(String.valueOf(quantity[2]));
        } else if (sel4.isSelected()) {
            if (quantity[3] > 0) quantity[3] -= 1;
            field4.setText(String.valueOf(quantity[3]));
        } else if (sel5.isSelected()) {
            if (quantity[4] > 0) quantity[4] -= 1;
            field5.setText(String.valueOf(quantity[4]));
        }
    }
}
