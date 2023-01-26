package task1;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int number;
		System.out.print("Enter value of a int number: ");
		Scanner scan = new Scanner(System.in);
		if(!scan.hasNextInt()) {
			System.err.println("Inputted number is invalid!");
			return;
		}
		number = scan.nextInt();
		
		if(parityChecking(number)) {
			System.out.println("Number " + number + " is even!");
		}
		else {
			System.out.println("Number " + number + " is odd!");
		}
	}
	
	public static boolean parityChecking(int number) {
		return number % 2 == 0;
	}
}
