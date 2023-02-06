package oop;

import java.time.LocalDate;

public class ReaderDemo {

	public static void main(String[] args) {
		Reader reader1 = new Reader(
				"Krapyvianskyi Dmytro Anatolievich",
				"5090114",
				"Information technology",
				LocalDate.parse("2004-09-21"),
				"+380941956745");
		
		reader1.takeBook(4);
		reader1.takeBook("Harry Potter and the Prisoner of Azkaban", "War and peace");
		
		Book book1 = new Book("Star Wars: Beginning", "George Lucas");
		Book book2 = new Book("Star Wars: The Clone Wars", "George Lucas");
		reader1.takeBook(book1, book2);
		
		reader1.returnBook(3);
		reader1.returnBook("Harry Potter and the Prisoner of Azkaban", "Star Wars: Beginning");
		reader1.returnBook(book2);
	}

}
