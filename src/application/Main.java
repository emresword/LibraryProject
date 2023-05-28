package application;
	
import java.io.IOException;

import application.dataAccsess.CostumerDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	private static Register register;
	private static Scene scene;
	@Override
	public void start(Stage primaryStage) throws IOException {
		scene=new Scene(loadFXML("FirstScene"));
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	@Override
	public void stop() throws IOException{
		CostumerDao.serialize(register.takeDuty());
	}
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader=new FXMLLoader(Main.class.getResource("/application/"+fxml+".fxml"));
		Parent parent=fxmlLoader.load();
		register=fxmlLoader.getController();
		return parent;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
