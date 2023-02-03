package oop;

public class Phone {
	private String number;
	private String model;
	private float weight;
	
	public Phone(String number, String model, float weight) {
		this(number, model);
		this.weight = weight;
	}
	
	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}
	
	public Phone() {}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void receiveCall(String callerName) {
		System.out.println(callerName + " is calling you");
	}
	
	public void receiveCall(String callerName, String callerNumber) {
		System.out.println(callerName + " with number " + callerNumber + " is calling you");
	}
	
	public void sendMessage(String message, String... numbers) {
		for (String num : numbers) {
			System.out.println(num + " was sent a message");
		}
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getModel() {
		return model;
	}
	
	public float getWeight() {
		return weight;
	}
}
