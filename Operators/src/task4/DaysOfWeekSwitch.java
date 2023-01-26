package task4;

import java.util.Scanner;

public class DaysOfWeekSwitch {
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
		String resultDay = dayOfWeekSwitch(numDay);
		
		System.out.println("It's " + resultDay + ", am I right?");
	}
	
	public static String dayOfWeekSwitch(int numDay) {
		String strDay = "";
		switch (numDay){
		case 1:
			strDay = "Mon";
			break;
		case 2:
			strDay = "Tue";
			break;
		case 3:
			strDay = "Wed";
			break;
		case 4:
			strDay = "Thu";
			break;
		case 5:
			strDay = "Fri";
			break;
		case 6:
		case 7:
			strDay = "Weekends";
			break;
		}
		
		return strDay;
	}
}
