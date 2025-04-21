package edu.training.jc.homework;


public class Main {

	public static void main(String[] args) {
		Book b1 = new Book(1, 
				"Структуры данных и алгоритмы JAVA (2-е издание)", 
				"Роберт Лафоре", 
				"SAMS", 
				2003, 
				704, 
				89.60, 
				"Твёрдый переплёт");
		
		Book b2 = new Book(2, 
				"Java. Полное руководство (12-е издание)", 
				"Герберт Шилдт", 
				"Mcgraw Hill", 
				2022, 
				1344, 
				120.99, 
				"Твёрдый переплёт");
		
		Book b3 = new Book(3, 
				"Философия Java", 
				"Брюс Эккель", 
				"Prentice Hall", 
				2006, 
				1168, 
				179, 
				"Твёрдый переплёт");
		
		Book b4 = new Book(4, 
				"Черный Тюльпан", 
				"Александр Дюма", 
				null, 
				2010, 
				240, 
				15, 
				"Твёрдый переплёт");
		
		//System.out.println(b1.toString());
		
		Library books = new Library();
		
		books.addBook(b1);
		books.addBook(b2);
		books.addBook(b3);
		books.addBook(b4);
		
		//System.out.println(books.getBooks());
		
		//System.out.println(books.findByAuthor("Александр Дюма"));
		
		//System.out.println(books.findByPublisher("SAMS"));
		
		//System.out.println(books.findAfterYear(2009));
		
		//System.out.println(books.findBeforeYear(2009));
	}

}
