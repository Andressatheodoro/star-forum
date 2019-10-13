package andressa.andressa.ifsc;

import java.io.IOException;

import javax.persistence.EntityManager;

import andressa.database.Conn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditarController {

	@FXML
	private TextField name;
	
	@FXML
	private TextField job;
	@FXML
	private TextField homeState;
	@FXML
	private TextField contact;
	@FXML
	private TextArea about;
	@FXML
	
	
	private void btsalvar(javafx.event.ActionEvent event) throws IOException {

		User user = new User(name.getText(), job.getText(), homeState.getText(), contact.getText(), about.getText());
		EntityManager em = Conn.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		System.out.println("edição cocluida");
		App.setRoot("perfil");
	}

	@FXML
	private void btvoltar(ActionEvent event) throws IOException {
		System.out.println("edição cancelada voltar ao perfil");
		App.setRoot("perfil");
	}

}
