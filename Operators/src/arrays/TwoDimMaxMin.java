package arrays;

public class TwoDimMaxMin {
	public static void main(String[] args) {
		int[][] currArr = {
				{61,86,57,90,50,99,98,46},
				{76,26,89,3,36,74,60,77},
				{71,63,23,89,40,21,71,14},
				{47,56,3,45,6,69,48,15},
				{75,81,95,40,64,37,95,19}
		};
		
		int[][] newArr = findMaxMin(currArr);
		printTwoDimIntArray(newArr);
	}
	
	public static int[][] findMaxMin(int[][] inArr){
		int[][] outArr = new int[5][2];
		for(int i = 0; i < inArr.length; i++) {
			int max = 0, min = Integer.MAX_VALUE;
			for(int j = 0; j < inArr[i].length; j++) {
				if(inArr[i][j] > max) {
					max = inArr[i][j];
				}
				else if(inArr[i][j] < min) {
					min = inArr[i][j];
				}
			}
			
			outArr[i][0] = max;
			outArr[i][1] = min;
		}
		return outArr;
	}
	
	public static void printTwoDimIntArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
