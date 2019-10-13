package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.fxml.FXML;

public class DashbordController {

	@FXML
	private void irperfil(javafx.event.ActionEvent event) throws IOException {

		App.setRoot("perfil");

	}

	@FXML
	private void sair(javafx.event.ActionEvent event) throws IOException {

		App.setRoot("user");

	}

	@FXML
	private void editar(javafx.event.ActionEvent event) throws IOException {

		App.setRoot("editar");
	}

	@FXML
	private void sobre(javafx.event.ActionEvent event) throws IOException {
		App.setRoot("sobre");
	}

	@FXML
	private void tema(javafx.event.ActionEvent event) throws IOException {
		System.out.println("volta criar tema");
		App.setRoot("criar");
	}

}