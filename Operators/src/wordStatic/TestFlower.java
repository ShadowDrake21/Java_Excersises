package wordStatic;

public class TestFlower {
	public static int valueOfSale;
	
	public static void main(String[] args) {
		Flower[] bouquet1 = new Flower[] {new Rose("���������", 12, 55), new Tulpan("���������", 15, 44), new Daisie("���������", 11, 40)};
		Flower[] bouquet2 = new Flower[] {new Rose("���������", 12, 55), new Rose("���������", 12, 55), new Rose("���������", 12, 55)};
		Flower[] bouquet3 = new Flower[] {new Rose("���������", 12, 55), new Rose("���������", 12, 55), new Rose("���������", 12, 55), 
				new Tulpan("���������", 15, 44), new Tulpan("���������", 15, 44), new Tulpan("���������", 15, 44), new Carnation("���������", 20, 64),
				new Carnation("���������", 20, 64), new Carnation("���������", 20, 64)};
		
		System.out.println("��������� ������ �1" + " = " + priceOfBouquet(bouquet1));
		System.out.println("��������� ������ �2" + " = " + priceOfBouquet(bouquet2));
		System.out.println("��������� ������ �3" + " = " + priceOfBouquet(bouquet3));
		System.out.println("����� ���������� ������ � �������" + " = " + valueOfSale);
		
	}
	
	public static double priceOfBouquet(Flower[] bouquet) {
		double priceOfFlower = 0;
		for(int i = 0; i < bouquet.length; i++) {
			priceOfFlower += bouquet[i].getPrice();
			valueOfSale++;
		}
		
		return priceOfFlower;
	}
}
