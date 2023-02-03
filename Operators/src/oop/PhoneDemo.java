package oop;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("+380967889844");
		phone1.setModel("Iphone 7s");
		phone1.setWeight((float) 104.5);

		Phone phone2 = new Phone();
		phone2.setNumber("+380957610444");
		phone2.setModel("Samsung A11");
		phone2.setWeight((float) 120.4);

		Phone phone3 = new Phone();
		phone3.setNumber("+380934589123");
		phone3.setModel("Xiaomi F12");
		phone3.setWeight((float) 98.1);
	
		printValues(phone1);
		printValues(phone2);
		printValues(phone3);
		
		phone1.receiveCall("Mother");
		phone2.receiveCall("Wifey", "+380967894310");
		phone3.receiveCall("Boss");
		
		phone1.sendMessage("Thanks ^^ See you next week", "+380934589123", "+4560945351289", "+380944569313");
	}

	public static void printValues(Phone phone) {
		System.out.println(
				"Number " + phone.getNumber() + ", model " + phone.getModel() + ", weight " + phone.getWeight());
	}

}
