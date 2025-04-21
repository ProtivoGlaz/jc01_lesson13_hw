package edu.training.jc.homework;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int page_count;
	private double price;
	private String binding;

	public Book(int id, String title, String author, String publisher, int year, int page_count, double price,
			String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.page_count = page_count;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPage_count() {
		return page_count;
	}

	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return String.format(
				"[id: %d | title: %s | author: %s | publisher: %s | year: %d | page_count: %d | price: %.2f | binding: %s]\n",
				this.id, this.title, this.author, this.publisher, this.year, this.page_count, this.price, this.binding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, id, page_count, price, publisher, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(binding, other.binding) && id == other.id
				&& page_count == other.page_count
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title)
				&& year == other.year;
	}
	
}
