package andressa.andressa.ifsc;

import java.io.IOException;

import javax.persistence.EntityManager;

import andressa.database.Conn;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {
	@FXML
	private TextField txtName;

	@FXML
	private TextField txtEmail;
	@FXML
	private PasswordField senha;

	@FXML
	private CheckBox confirmation;

	@FXML
	private void btlogin(javafx.event.ActionEvent event) throws IOException {

		Register register = new Register(txtName.getText(),senha.getText(), txtEmail.getText(), confirmation.isSelected());
		EntityManager em = Conn.getEntityManager();
		em.getTransaction().begin();
		em.persist(register);
		em.getTransaction().commit();
		em.close();
		App.setRoot("dashboard");
	}

	@FXML
	private void btcancel(javafx.event.ActionEvent event) throws IOException {
		System.out.println("voltar");
		App.setRoot("user");
	}
}
