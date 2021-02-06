package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Calculator extends Application 
{
	public void start(Stage primaryStage) 
	{
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		tfNumber1.setPrefColumnCount(4);
		tfNumber2.setPrefColumnCount(4);
		tfResult.setPrefColumnCount(4);

		pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
		
		// Create four buttons
		HBox hBox = new HBox(5);
		Button btCount = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btCount, btSubtract, btMultiply, btDivide);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 350, 60);
		primaryStage.setTitle("Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		btCount.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber2.getText()) + Double.parseDouble(tfNumber1.getText()) + "");
		});

		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText()) + "");
		});

		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText()) + "");
		});

		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText()) + "");
		});
	}
			
	public static void main(String[] args) 
	{
		launch(args);
	}
}
