package wordStatic;

public class TestFruit {
	public static double priceForAll = 0;
	
	public static void main(String[] args) {
		Apple apple = new Apple(5.1);
		Pear pear = new Pear(1.5);
		Apricot apricot = new Apricot(4);
		
		priceForAll = apple.priceForWeight(30) + pear.priceForWeight(63.6) + apricot.priceForWeight(91.2);
		
		System.out.println("÷ена за €блока: " + apple.priceForWeight(30));
		System.out.println("÷ена за груши: " + pear.priceForWeight(63.6));
		System.out.println("÷ена за абрикосы: " + apricot.priceForWeight(91.2));
		System.out.printf("÷ена за все: %.2f", priceForAll);
	}
	
	
}
