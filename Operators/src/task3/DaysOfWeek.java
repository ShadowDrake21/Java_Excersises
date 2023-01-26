package task3;

import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		System.out.print("Enter a number from 1 to 7: ");
		Scanner scan = new Scanner(System.in);
		if(!scan.hasNextInt()) {
			System.err.println("Invalid value!"); 
			return;
		}
		
		int numDay = scan.nextInt();
		if (numDay < 1 || numDay >7) {
			System.err.println("The number is out of the interval!");
			return;
		}
		String resultDay = dayOfWeek(numDay);
		
		System.out.println("It's " + resultDay + ", am I right?");
	}
	
	public static String dayOfWeek(int numDay) {
		String strDay;
		if (numDay == 1) {
			strDay = "Mon";
		} else if (numDay == 2) {
			strDay = "Tue";
		} else if (numDay == 3) {
			strDay = "Wed";
		} else if (numDay == 4) {
			strDay = "Thu";
		} else if (numDay == 5) {
			strDay = "Fri";
		} else {
			strDay = "Weekends";
		}
		
		return strDay;
	}
}
