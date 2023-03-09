package clothes;

public class Pants extends Clothes implements MenClothes, WomenClothes {

	public Pants(Size size, double price, String color) {
		super(size, price, color);
	}

	@Override
	public void dressWoman() {
		System.out.println("������� ����� ����� �� Lacoste");
	}

	@Override
	public void dressMan() {
		System.out.println("������� ���� ����� ��������");
	}

}
