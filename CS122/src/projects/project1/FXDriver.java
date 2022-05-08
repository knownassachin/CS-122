package projects.project1;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class FXDriver extends Application {
	public void start(Stage primaryStage)  {
		Scene scene = new Scene(new ProjectFX(), 600, 600, false);

		primaryStage.setTitle("Linked List");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)  {
		launch(args);
	}

	
	

}