package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RemovController {
	@FXML
	private void btvoltar(ActionEvent event) throws IOException {
		System.out.println("voltar Perfil");
		App.setRoot("perfil");
	}

}
