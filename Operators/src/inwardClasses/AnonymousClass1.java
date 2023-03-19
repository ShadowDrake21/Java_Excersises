package inwardClasses;

import printing.Printable;

public class AnonymousClass1 {

	public static void main(String[] args) {
		
		Printable printable = new Printable() {
			public void print() {
				System.out.println("Метод print() интерфейса Printable вызван!");
			}
		};
		printable.print();
	}

}
