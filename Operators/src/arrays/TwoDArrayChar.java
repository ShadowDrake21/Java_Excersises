package arrays;

public class TwoDArrayChar {

	public static void main(String[] args) {
		char[][] twoDimArrChar = {
				{'a', 'b'},
				{'1', '2'},
				{'c', 'd'},
				{'3', '4'}
		};
		
		printTwoDimCharArr(twoDimArrChar);
	}
	
	public static void printTwoDimCharArr(char[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
