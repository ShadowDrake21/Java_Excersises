package printing;

public class Book implements Printable {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public void print() {
		System.out.println("Book [title=" + title + ", author=" + author + ", year=" + year + "]");
	}

	public static void printBooks(Printable[] printable) {
		for(Printable print : printable) {
			if(print instanceof Book) {
				System.out.println("There is a book " + ((Book) print).title);
			}
		}
	}
}
