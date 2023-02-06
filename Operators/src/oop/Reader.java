package oop;

import java.time.LocalDate;

public class Reader {
	private String fio;
	private String biletNum;
	private String faculty;
	private LocalDate dateOfBirth;
	private String telefon;
	
	public void takeBook(int bookNum) {
		System.out.println(fio + " took " + bookNum + " books.");
	}
	
	public void takeBook(String... books) {
		System.out.print(fio + " took books: ");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i]);
			if(i + 1 != books.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public void takeBook(Book...books) {
		System.out.print(fio + " took books: ");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i].getBookName());
			if(i + 1 != books.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public void returnBook(int bookNum) {
		System.out.println(fio + " returned " + bookNum + " books.");
	}
	
	public void returnBook(String...books) {
		System.out.print(fio + " returned books: ");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i]);
			if(i + 1 != books.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public void returnBook(Book...books) {
		System.out.print(fio + " returned books: ");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i].getBookName());
			if(i + 1 != books.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public Reader(String fio, String biletNum, String faculty, LocalDate dateOfBirth, String telefon) {
		this.fio = fio;
		this.biletNum = biletNum;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.telefon = telefon;
	}
}
