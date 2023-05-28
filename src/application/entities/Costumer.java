package application.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Costumer implements Serializable{
	private static final long serialVersionForCostumer=1L;
	private String name;
	private String password;
	private List<Book> books;
	private LocalDate firstDate,lastDate;//this will state when costurmer take a book and when he/she give back
	public Costumer(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public Costumer(String name, String password, List<Book> books, LocalDate firstDate) {
		this.name = name;
		this.password = password;
		this.books = books;
		this.firstDate = firstDate;
	}
	public Costumer(String name, String password, List<Book> books, LocalDate firstDate, LocalDate lastDate) {
		this.name = name;
		this.password = password;
		this.books = books;
		this.firstDate = firstDate;
		this.lastDate = lastDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public LocalDate getFirstDate() {
		return firstDate;
	}
	public void setFirstDate(LocalDate firstDate) {
		this.firstDate = firstDate;
	}
	public LocalDate getLastDate() {
		return lastDate;
	}
	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

}
