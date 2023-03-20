package collections;

public class HeavyBox implements Comparable{
	private double weight;
	
	public HeavyBox(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getDescription() {
		System.out.println("Объект класса HeavyBox: вес - " + weight);
	}

	@Override
	public String toString() {
		return "HeavyBox [weight=" + weight + "]";
	}

	@Override
	public int compareTo(Object box) {
		return this.hashCode() - box.hashCode();
	}
}
