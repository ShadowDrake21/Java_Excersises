package arrays;

public class TwoDArrayString {
	public static void main(String[] args) {
		String[][] twoDArrString = new String[3][6];
		
		fillTwoDimArray(twoDArrString);
		printTwoDimArray(twoDArrString);
	}
	
	public static void fillTwoDimArray(String[][] arr) {
		char ch = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch + "" + (j + 1);
			}
			ch++;
		}
	}
	
	public static void printTwoDimArray(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
