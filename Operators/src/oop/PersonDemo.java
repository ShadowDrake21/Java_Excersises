package oop;

public class PersonDemo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setFullName("John Cena");
		Person person2 = new Person("Alexandr Sergeivich Pushkin", 37);
		
		person1.move();
		person1.talk();
		
		person2.move();
		person2.talk();
	}

}
