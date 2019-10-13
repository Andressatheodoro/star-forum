package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PerguntaController {
	@FXML
	 private void voltar(ActionEvent event) throws IOException {
	    	System.out.println(" voltar a dashboard");
	        App.setRoot("dashboard");
	    }
	
}
