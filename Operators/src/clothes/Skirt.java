package clothes;

public class Skirt extends Clothes implements WomenClothes {

	public Skirt(Size size, double price, String color) {
		super(size, price, color);
	}

	@Override
	public void dressWoman() {
		System.out.println("Женщина одела мини-юбку");
	}

}
