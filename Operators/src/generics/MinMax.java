package generics;

public class MinMax <T extends Comparable <T>>{
	public T array[];
	
	public MinMax(T array[]) {
		this.array = array;
	}
	
	public T minValue() {
		T min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(min.compareTo(array[i]) < 0) {
				min = array[i];
			}
		}
		return min;
	}
	
	public T maxValue() {
		T max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(max.compareTo(array[i]) > 0) {
				max = array[i];
			}
		}
		return max;
	}
}
