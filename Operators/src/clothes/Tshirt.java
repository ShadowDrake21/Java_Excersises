package clothes;

public class Tshirt extends Clothes implements MenClothes, WomenClothes {

	public Tshirt(Size size, double price, String color) {
		super(size, price, color);
	}

	@Override
	public void dressWoman() {
		System.out.println("������� ����� �������� �� Prada");
	}

	@Override
	public void dressMan() {
		System.out.println("������� ���� �������� �� Tommy Hilfiger");
	}

}
