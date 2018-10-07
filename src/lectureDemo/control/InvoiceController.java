package lectureDemo.control;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class InvoiceController extends Controller {

    private String statement;

    private Label statementUI;

    @FXML
    private AnchorPane anchor;

    public InvoiceController(Stage s, String statement) {
        super(s);
        this.statement = statement;
    }


    @FXML
    public void initialize() {
        statementUI = new Label(statement);
        anchor.getChildren().add(statementUI);
        statementUI.setLayoutX(100);
        statementUI.setLayoutY(100);
        statementUI.setFont(new Font("Arial", 17));

    }
    @FXML
    public void handleBackButton() {
        Screen cart = new Screen(super.getS(), "Shopping Cart", "lectureDemo/view/cart.fxml");
        CartController cartController = new CartController(super.getS());
        cart.start(cartController);
    }
}