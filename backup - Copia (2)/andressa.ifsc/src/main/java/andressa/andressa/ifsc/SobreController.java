package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SobreController {
	 @FXML
	 private void btvoltar(ActionEvent event) throws IOException {
	    	System.out.println("volta dashboard");
	        App.setRoot("dashboard");
	    }
}
