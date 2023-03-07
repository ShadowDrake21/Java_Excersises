package printing;

public class Magazine implements Printable {
	private String title;
	private String author;
	private int year;
	
	public Magazine(String title, String author, int year) {
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
		System.out.println("Magazine [title=" + title + ", author=" + author + ", year=" + year + "]");
	}
	
	public static void printMagazines(Printable[] printable) {
		for(Printable print : printable) {
			if(print instanceof Magazine) {
				System.out.println("There is a magazine " + ((Magazine) print).title);
			}
		}
	}

}
