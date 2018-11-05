package pattern.command.example2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
