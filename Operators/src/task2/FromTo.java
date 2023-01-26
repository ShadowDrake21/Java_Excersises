package task2;

import java.util.Scanner;

public class FromTo {
	public static void main(String[] args) {
		System.out.print("Enter an int number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String result = numberInterval(num);
		System.out.println(result);
	}
	
	public static String numberInterval(int numberIn) {
		if(numberIn >= 0 && numberIn <= 10) {
			return "The number is positive and it's less then 10 or zero";
		}
		else {
			return "The number is positive and it's bigger then 10 or the number is negative";
		}
	}
}
