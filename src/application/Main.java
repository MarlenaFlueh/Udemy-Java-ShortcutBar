package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			HBox root = new HBox();
			root.getStyleClass().add("root");
			root.setPrefSize(410, 7);
			root.setSpacing(5);
			root.setAlignment(Pos.CENTER);
			
			Button btnZero = new Button();
			Button btnOne = new Button();
			Button btnTwo = new Button();
			Button btnThree = new Button();
			Button btnFour = new Button();
			Button btnFive = new Button();
			
			btnZero.setPrefSize(64, 64);
			btnOne.setPrefSize(64, 64);
			btnTwo.setPrefSize(64, 64);
			btnThree.setPrefSize(64, 64);
			btnFour.setPrefSize(64, 64);
			btnFive.setPrefSize(64, 64);
			
			btnZero.getStyleClass().add("btn0");
			btnOne.getStyleClass().add("btn1");
			btnTwo.getStyleClass().add("btn2");
			btnThree.getStyleClass().add("btn3");
			btnFour.getStyleClass().add("btn4");
			btnFive.getStyleClass().add("btn5");
			
			root.getChildren().add(btnZero);
			root.getChildren().add(btnOne);
			root.getChildren().add(btnTwo);
			root.getChildren().add(btnThree);
			root.getChildren().add(btnFour);
			root.getChildren().add(btnFive);
			
			btnZero.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					getHostServices().showDocument("https://www.netflix.com/");
				}
				
			});
			
			btnOne.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					getHostServices().showDocument("https://www.youtube.com/");
				}
				
			});
			
			btnTwo.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					getHostServices().showDocument("https://www.bitcoin.de/");
				}
				
			});
			
			btnThree.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					getHostServices().showDocument("https://inbox.google.com/");
				}
				
			});
			
			btnFour.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					getHostServices().showDocument("http://raspberrypros.com");
				}
				
			});
			
			btnFive.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
				
			});
			
			Scene scene = new Scene(root,470,75);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("../images/raspberry.png")));;
			primaryStage.setX((screenSize.getWidth() / 2) - 235);
			primaryStage.setY(20);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
