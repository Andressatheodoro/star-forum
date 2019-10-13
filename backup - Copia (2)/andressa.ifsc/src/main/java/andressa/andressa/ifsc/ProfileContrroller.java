package andressa.andressa.ifsc;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ProfileContrroller implements Initializable {
	@FXML
	private ListView<Criar> lista;
	@FXML
	private Button btremove;
	@FXML
	private Button btlixeira;
	@FXML
	private Button btedit;

	public void updateList() {
		UserDAO dao = new UserDAO();
		lista.setItems(null);
		lista.setItems((ObservableList<Criar>) dao.getAll());
	}

	@FXML
	private void update() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("update.fxml"));
		Parent parent = fxmlLoader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	private void delete() {
		new UserDAO().delete(lista.getSelectionModel().getSelectedItem());
	}

	// botao lixeira
	@FXML
	private void btlixeira(ActionEvent event) throws IOException {
		System.out.println("ir para lixeira");
		App.setRoot("removidos");

	}

	// botao voltar
	@FXML
	private void voltar(ActionEvent event) throws IOException {
		App.setRoot("dashboard");

	}

	// botao editar
	@FXML
	private void btedit(ActionEvent event) throws IOException {
		System.out.println("editar perfil");
		App.setRoot("editar");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		updateList();
	}
}