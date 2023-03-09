package clothes;

public class TestClothes {

	public static void main(String[] args) {
		Clothes[] clothes = {new Tshirt(Size.M, 300.99, "желтый"), new Pants(Size.L, 510.99, "синий"),
				new Skirt(Size.S, 1020, "черный"), new Tie(Size.L, 300.99, "фиолетовый")};
		
		Atelier atelier = new Atelier();
		System.out.println("Женская одежда:");
		atelier.dressWoman(clothes);
		System.out.println();
		
		System.out.println("Мужская одежда:");
		atelier.dressMan(clothes);
		System.out.println();
	}
}
