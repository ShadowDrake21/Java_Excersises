package clothes;

public class Tie extends Clothes implements MenClothes {

	public Tie(Size size, double price, String color) {
		super(size, price, color);
	}

	@Override
	public void dressMan() {
		System.out.println("Мужчина одел галстук от Chanel");
	}

}
