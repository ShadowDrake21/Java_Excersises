package inwardClasses;

public class CookableTest {

	public static void main(String[] args) {
		Food food = new Food();
		food.prepare(new Cookable() {
			@Override
			public void cook(String str) {
				System.out.println("Готовим еду");
			}
		}, "Готовим суши");
	}

}
