package task7;

public class SymbolsFor {
	public static void main(String[] args) {
		char symb = 'h';
		symbFor(symb);
	}
	
	public static void symbFor(char s) {
		for(int i = 0; i < 5; i++) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.print(s++ + " ");
		}
	}
}
