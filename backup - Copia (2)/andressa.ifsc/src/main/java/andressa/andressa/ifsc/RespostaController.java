package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.fxml.FXML;

public class RespostaController {
	 @FXML
	    private void btvoltar(javafx.event.ActionEvent event) throws IOException{
	    	System.out.println("voltar pra dashboard");
	    	App.setRoot("dashboard");
	    }
}
