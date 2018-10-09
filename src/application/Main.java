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

			Button[] buttons = new Button[6];

			for (int i = 0; i < buttons.length; i++) {
				buttons[i] = new Button();
				buttons[i].setPrefSize(64, 64);
				buttons[i].getStyleClass().add("btn" + i);
				root.getChildren().add(buttons[i]);
			}
			;

			ActionLink btnZero = new ActionLink(buttons[0], "https://www.netflix.com/");
			btnZero.start(primaryStage);

			ActionLink btnOne = new ActionLink(buttons[1], "https://www.youtube.com/");
			btnOne.start(primaryStage);

			ActionLink btnTwo = new ActionLink(buttons[2], "https://www.bitcoin.de/");
			btnTwo.start(primaryStage);

			ActionLink btnThree = new ActionLink(buttons[3], "https://inbox.google.com/");
			btnThree.start(primaryStage);

			ActionLink btnFour = new ActionLink(buttons[4], "http://raspberrypros.com");
			btnFour.start(primaryStage);

			ActionExit btnFive = new ActionExit(buttons[5]);
			btnFive.start(primaryStage);

			Scene scene = new Scene(root, 470, 75);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image(ClassLoader.getSystemResourceAsStream("images/raspberry.png")));
			;
			primaryStage.setX((screenSize.getWidth() / 2) - 235);
			primaryStage.setY(20);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
