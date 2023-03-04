package wordStatic;

public abstract class Fruit {
	private double weight;
	
	public final void printManufacturerInfo() {
		System.out.println("Made in Ukraine");
	}

	public abstract double priceForWeight(double price);

	public Fruit(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
