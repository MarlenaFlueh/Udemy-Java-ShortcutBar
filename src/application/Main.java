package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			root.setPrefSize(340, 7);
			root.setSpacing(10);
			root.setAlignment(Pos.CENTER);
			
			Button btnOne = new Button();
			Button btnTwo = new Button();
			Button btnThree = new Button();
			Button btnFour = new Button();
			Button btnFive = new Button();
			
			btnOne.setPrefSize(64, 64);
			btnTwo.setPrefSize(64, 64);
			btnThree.setPrefSize(64, 64);
			btnFour.setPrefSize(64, 64);
			btnFive.setPrefSize(64, 64);
			
			btnOne.getStyleClass().add("btnOne");
			btnTwo.getStyleClass().add("btnTwo");
			btnThree.getStyleClass().add("btnThree");
			btnFour.getStyleClass().add("btnFour");
			btnFive.getStyleClass().add("btnFive");
			
			root.getChildren().add(btnOne);
			root.getChildren().add(btnTwo);
			root.getChildren().add(btnThree);
			root.getChildren().add(btnFour);
			root.getChildren().add(btnFive);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
