package application;

import application.entities.Costumer;
import application.bussines.CostumerManager;
import application.dataAccsess.CostumerDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUp {
	Scene scene;
	Parent root;
	Stage stage;
@FXML
TextField costumerName,costumerPassword;
	public void goBookList(ActionEvent event) throws Exception {
		Costumer costumer=new Costumer(costumerName.getText(), costumerPassword.getText());
		CostumerManager.isThere(costumer);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ProcessOfCostumer.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
