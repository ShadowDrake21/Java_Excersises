package generics;

public class MinMaxTest {

	public static void main(String[] args) {
		Float arr[] = new Float[] {1.1f, 3.5f, 0.5f, 0.1f, 44.5f, 3.1f, 44.4f};
		MinMax<Float> m = new MinMax<Float>(arr);
		
		System.out.println("The min of array = " + m.minValue());
		System.out.println("The max of array = " + m.maxValue());
	}

}
