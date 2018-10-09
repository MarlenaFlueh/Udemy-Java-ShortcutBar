package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ActionExit extends Application {

	private Button btn;

	public ActionExit(Button btn, Stage stg) throws Exception {
		this.btn = btn;
		start(stg);
	};

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
