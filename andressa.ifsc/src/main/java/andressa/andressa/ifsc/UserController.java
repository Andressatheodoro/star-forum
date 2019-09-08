package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class UserController {
	
    @FXML
    private void btlogin(ActionEvent event) throws IOException {
    System.out.println("teste");
    App.setRoot("dashboard");
    }
}
