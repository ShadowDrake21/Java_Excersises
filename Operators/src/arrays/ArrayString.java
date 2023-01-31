package arrays;

public class ArrayString {

	public static void main(String[] args) {
		String[] arr = new String[7];
		arr[0]= "Monday";
		arr[1] = "Tuesday";
		arr[2] = "Wednesday";
		arr[3] = "Thursday";
		arr[4] = "Friday";
		arr[5] = "Saturday";
		arr[6] = "Sunday"; 
		
		printDay(arr, 7);
	}
	
	public static void printDay(String[] arr, int pos) {
		System.out.println("You picked up " + arr[pos - 1]);
	}
}
