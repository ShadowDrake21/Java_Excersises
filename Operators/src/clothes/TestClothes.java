package clothes;

public class TestClothes {

	public static void main(String[] args) {
		Clothes[] clothes = {new Tshirt(Size.M, 300.99, "������"), new Pants(Size.L, 510.99, "�����"),
				new Skirt(Size.S, 1020, "������"), new Tie(Size.L, 300.99, "����������")};
		
		Atelier atelier = new Atelier();
		System.out.println("������� ������:");
		atelier.dressWoman(clothes);
		System.out.println();
		
		System.out.println("������� ������:");
		atelier.dressMan(clothes);
		System.out.println();
	}
}
