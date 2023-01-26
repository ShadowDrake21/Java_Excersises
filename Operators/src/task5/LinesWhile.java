package task5;

public class LinesWhile {
	public static void main(String[] args) {
		printLines();
	}
	
	public static void printLines() {
		int i = 0;
		while(++i <= 10) {
			System.out.println("Task" + i);
		}
	}
}
