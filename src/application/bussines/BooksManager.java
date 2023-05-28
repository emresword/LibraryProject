package application.bussines;

import java.util.List;

import application.dataAccsess.BooksDao;
import application.entities.Book;

public class BooksManager {
	public static List<Book> books;
	
	public static void add(Book book) throws Exception {
		for(Book book2:books) {
			if(book.getName()==book2.getName()) {
				throw new Exception("this book is already exist");
			}
		}
		books.add(book);
		BooksDao.serialize(books);
	}
	public void delete(Book book) {
		books.remove(book);
		
	}
	public void update(Book book) {
		 
	}
}
