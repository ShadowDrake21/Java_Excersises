package collections;

public class Product {
	private String type;
	private double weight;
	
	public Product(String type, double weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", weight=" + weight + "]";
	}
	
	
}
