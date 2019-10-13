package andressa.andressa.ifsc;

import java.io.IOException;

import javax.persistence.EntityManager;

import andressa.database.Conn;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CriarController {

	
	@FXML
	private TextField title;
	@FXML
	private CheckBox politicas;
	@FXML
	private TextArea descricao;

	@FXML
	private void compartilhar(javafx.event.ActionEvent event) throws IOException {

		Criar criar = new Criar(title.getText(), politicas.isSelected(), descricao.getText());
		EntityManager em = Conn.getEntityManager();
		em.getTransaction().begin();
		em.persist(criar);
		em.getTransaction().commit();
		em.close();
		System.out.println("volta criar tema");
		App.setRoot("dashboard");
	}

	@FXML
	private void volt(javafx.event.ActionEvent event) throws IOException {

		System.out.println("volta criar tema");
		App.setRoot("dashboard");
	}
}
