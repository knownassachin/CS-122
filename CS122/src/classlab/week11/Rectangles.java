package classlab.week11;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rectangles extends Application {
	Rectangle [] rectangles;
	Color[] colors = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
	
	public void start(Stage primaryStage) {
		
		
		rectangles = new Rectangle[5];
		Random r = new Random();
		for(int i=0;i<5;i++) {
			rectangles[i] = new Rectangle(r.nextInt(500)+10,r.nextInt(500)+10,r.nextInt(91)+10,r.nextInt(91)+10);
			rectangles[i].setFill(Color.WHITE);
		}

		Button change = new Button("Change Color!");
		change.setOnAction(this::processChangeColor);
		
		Group root = new Group();
		for(Rectangle x: rectangles) {
			root.getChildren().add(x);
		}
		
		root.getChildren().add(change);
		Scene scene = new Scene(root, 600, 600, Color.BLUEVIOLET);
		
		primaryStage.setTitle("Random Rectangles");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void processChangeColor(ActionEvent event) {
		Random r = new Random();
		Color newColor = colors[r.nextInt(4)];
		for(Rectangle x: rectangles) {
			x.setFill(newColor);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
