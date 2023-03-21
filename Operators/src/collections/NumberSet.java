package collections;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumberSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] strArr = str.split(", ");

		SortedSet<Integer> intSet = new TreeSet<Integer>();
		
		for(int i = 0; i < strArr.length; i++) {
			intSet.add(Integer.parseInt(strArr[i]));
		}
		
		intSet.forEach(x -> System.out.print(x + " "));
		
	}

}
