package wordStatic;

public class Apricot extends Fruit {

	public Apricot(double weight) {
		super(weight);
	}

	@Override
	public double priceForWeight(double price) {
		return this.getWeight() * price;
	}

}
