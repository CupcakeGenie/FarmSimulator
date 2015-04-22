package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.HPos.RIGHT;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import gui.Controller;

public class FarmGUI extends Application {
	Controller controller;
	Text actiontarget = new Text();
	
	public static void main(String[] args) {
		FarmGUI viewport = new FarmGUI();
		Controller controller = new Controller(viewport);
		viewport.registerController(controller);
		launch(args);
	}
	
	@Override
    public void start(Stage primaryStage) {
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text scenetitle = new Text("FarmSimulator v0.01");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		scenetitle.setFill(Color.web("#FF9900"));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Button btnNewGame = new Button("PLANT SEED");
		Button btnLoadGame = new Button("HARVEST PLANT");
		Button btnOptions = new Button("OPTIONS");
		Button btnCredits = new Button("CREDITS");
		Button btnQuit = new Button("EXIT GAME");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.CENTER_RIGHT);
		hbBtn.getChildren().add(btnNewGame);
		hbBtn.getChildren().add(btnLoadGame);
		hbBtn.getChildren().add(btnOptions);
		hbBtn.getChildren().add(btnCredits);
		hbBtn.getChildren().add(btnQuit);
		grid.add(hbBtn, 1, 4);
        grid.add(actiontarget, 1, 6);
        
        btnNewGame.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		print(controller.plantSeed());
        		}
        	});
        
        btnLoadGame.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		actiontarget.setFill(Color.web("#FF9900"));
        		actiontarget.setText("TODO: Add harvesting");
        	}
        });
        
        btnOptions.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		actiontarget.setFill(Color.web("#FF9900"));
        		actiontarget.setText("Opening options menu...");
        	}
        });
        
        btnCredits.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		actiontarget.setFill(Color.web("#FF9900"));
        		actiontarget.setText("FarmSimulator credits:\n\nSamuli Suomaa\n"
        				+ "Timo Kurkinen\nTaru Lahtinen");
        	}
        });
        
        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		System.exit(0);
        	}
        });
        
        
		Scene scene = new Scene(grid, 800, 600);
		scene.getStylesheets().add("gui/ui.css");
		primaryStage.setScene(scene);
		primaryStage.show();
    }

	public void registerController(Controller controller) {
		this.controller = controller;
		
	}
	public void print(String str) {
		actiontarget.setFill(Color.web("#FF9900"));
		actiontarget.setText(str);
	}
	
}
