package MVCdemo.control;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Screen cartScreen = new Screen(primaryStage, "Shopping Cart", "lectureDemo/view/cart.fxml");
        CartController cartController = new CartController(primaryStage);
        cartScreen.start(cartController);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
