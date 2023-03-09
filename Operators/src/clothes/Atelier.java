package clothes;

public class Atelier {
	
	public void dressWoman(Clothes[] clothes) {
		for(Clothes cloth : clothes) {
			if(cloth instanceof WomenClothes) {
				((WomenClothes) cloth).dressWoman();
				if(cloth instanceof MenClothes) {
					System.out.println("Одежда унисекс\n");
				}
			}
		}
	}
	
	public void dressMan(Clothes[] clothes) {
		for(Clothes cloth : clothes) {
			if(cloth instanceof MenClothes) {
				((MenClothes) cloth).dressMan();
				if(cloth instanceof WomenClothes) {
					System.out.println("Одежда унисекс\n");
				}
			}
		}
	}
}
