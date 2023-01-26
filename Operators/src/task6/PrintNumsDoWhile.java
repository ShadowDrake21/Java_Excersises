package task6;

public class PrintNumsDoWhile {
	public static void main(String[] args) {
		printNumbers();
	}
	
	public static void printNumbers() {
		int i = 1;
		do {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		} while(i++ < 100);
	}
}
