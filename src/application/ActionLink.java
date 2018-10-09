package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ActionLink extends Application {
	
	private Button btn;
	private String url;
	
	public ActionLink(Button btn, String url) {
		this.btn = btn;
		this.url = url;
	};
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				getHostServices().showDocument(url);
			}
			
		});
	}

}
