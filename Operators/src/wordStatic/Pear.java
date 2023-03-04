package wordStatic;

public class Pear extends Fruit {

	public Pear(double weight) {
		super(weight);
	}

	@Override
	public double priceForWeight(double price) {
		return this.getWeight() * price / 0.9;
	}

}
