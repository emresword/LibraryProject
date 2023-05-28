package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Costumer {
	Scene scene;
	Parent root;
	Stage stage;

	public void register(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Register.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void signUp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
