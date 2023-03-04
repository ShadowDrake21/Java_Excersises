package wordStatic;

public class Apple extends Fruit {

	public Apple(double weight) {
		super(weight);
	}

	@Override
	public double priceForWeight(double price) {
		return this.getWeight() * price * 1.2;
	}

}
