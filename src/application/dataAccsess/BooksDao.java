package application.dataAccsess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import application.entities.Book;

public class BooksDao {
	public static final String DATA_PATH="data.books";
	
	public static <E> void serialize(List<E>datas) throws FileNotFoundException, IOException {
		try (var serializer=new ObjectOutputStream(new FileOutputStream(DATA_PATH))){
			serializer.writeObject(datas);
		}
	}
	public static List<Book> deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		try(var deserializer=new ObjectInputStream(new FileInputStream(DATA_PATH))){
			List<Book> duty=(List<Book>) deserializer.readObject();
			return duty;
		}
		
	}
}
