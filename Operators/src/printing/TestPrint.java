package printing;

public class TestPrint {

	public static void main(String[] args) {
		Printable[] printArr = {new Book("Star Wars: Episode 3", "Matthew Stover", 2005), new Magazine("Rooling Stone ¹4", "Jann Simon Wenner", 2022),
				new Book("Harry Potter and the Prisoner of Azkaban", "J.K.Rowling", 1999)};
		
		for(Printable print : printArr) {
			print.print();
		}
		
		System.out.println();
		Magazine.printMagazines(printArr);
		System.out.println("========================================");
		Book.printBooks(printArr);
	}

}
