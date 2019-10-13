package andressa.andressa.ifsc;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserController {
	@FXML
	private TextField txtName;

	@FXML
	private PasswordField txtEmail;
	@FXML
	private void btlogin(ActionEvent event) throws IOException {
		System.out.println(txtName.getText());
		System.out.println(txtEmail.getText());
		
		
		
		
		App.setRoot("dashboard");

	}

	@FXML
	private void btregister(ActionEvent event) throws IOException {
		System.out.println("registro");
		App.setRoot("register");

	}

	@FXML
	private void btgoog(ActionEvent event) throws IOException {
		System.out.println("entrar com google");
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("google.fxml"));
		Parent fxml = fxmlLoader.load();
		Scene scene = new Scene(fxml);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	@FXML
	private void btfb(ActionEvent event) throws IOException {
		System.out.println("entrar com facebook");
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FB.fxml"));
		Parent fxml = fxmlLoader.load();
		Scene scene = new Scene(fxml);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	@FXML
	private void bttwitter(ActionEvent event) throws IOException {
		System.out.println("entrar com TWITTER");
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("twitter.fxml"));
		Parent fxml = fxmlLoader.load();
		Scene scene = new Scene(fxml);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

	}

	@FXML
	private void btgit(ActionEvent event) throws IOException {
		System.out.println("entrar com github");
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("git.fxml"));
		Parent fxml = fxmlLoader.load();
		Scene scene = new Scene(fxml);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

}
