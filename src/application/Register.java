package application;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.bussines.CostumerManager;
import application.dataAccsess.CostumerDao;
import application.entities.Costumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Register implements Initializable{
	Scene scene;
	Parent root;
	Stage stage;
	@FXML
	TextField registerName,registerPassword;
	@FXML
	private ListView<Costumer> costumerAddedToListView;//listviewe eklecek costumerlar
	ObservableList<Costumer> dataCostumers=FXCollections.observableArrayList();

	public void returnCostumer(ActionEvent event) throws IOException,Exception {
		Costumer costumer=new Costumer(registerName.getText(),registerPassword.getText());
		CostumerManager.add(costumer);
        CostumerManager.costumers.forEach(i->{
        	dataCostumers.add(i);
        	costumerAddedToListView.setItems(dataCostumers);
        });
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Costumer.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public  List<Costumer> takeDuty(){
		return costumerAddedToListView.getItems();
	}
	public void  bookListForEmployer(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ProcessOfEmployer.fxml"));
		root = loader.load();
		stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			//daha önceden eklenen degerler burda listviewa ekleniyor
			var duties=CostumerDao.deserialize();
			duties.forEach(i->costumerAddedToListView.getItems().add(i));
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
