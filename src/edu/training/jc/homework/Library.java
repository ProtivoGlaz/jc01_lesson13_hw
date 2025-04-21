package edu.training.jc.homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<Book>();
	
	public Library() {
		
	}
	
	public Library(ArrayList<Book> books) {
		this.books = books;
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public List<Book> findByAuthor(String author) {
		List<Book> temp = new ArrayList<>();
		
		for(int i = 0; i < this.books.size(); i++) {
			if(author == books.get(i).getAuthor()) {
				temp.add(books.get(i));
			}
		}
		
		return temp;
	}
	
	public List<Book> findByPublisher(String publisher) {
		List<Book> temp = new ArrayList<>();

		for(int i = 0; i < this.books.size(); i++) {
			if(publisher == books.get(i).getPublisher()) {
				temp.add(books.get(i));
			}
		}
		
		return temp;
	}
	
	public List<Book> findAfterYear(int year) {
		List<Book> temp = new ArrayList<>();

		for(int i = 0; i < this.books.size(); i++) {
			if(books.get(i).getYear() >= year) {
				temp.add(books.get(i));
			}
		}
		
		return temp;
	}
	
	public List<Book> findBeforeYear(int year) {
		List<Book> temp = new ArrayList<>();

		for(int i = 0; i < this.books.size(); i++) {
			if(books.get(i).getYear() <= year) {
				temp.add(books.get(i));
			}
		}
		
		return temp;
	}
	
}
