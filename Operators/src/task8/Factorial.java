package task8;

public class Factorial {
	public static void main(String[] args) {
		int numFactor = (int) (Math.random() * 5);
		System.out.println("Factorial of " + numFactor + " = " + factorial(numFactor));
	}
	
	public static int factorial(int num) {
		int resultValue = 1;
		for(int i = 1; i <= num; i++) {
			resultValue *= i;
		}
		return resultValue;
	}
}
