package oop;

public class Person {
	private String fullName;
	private int age;
	
	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void move() {
		System.out.println(this.fullName + " is moving");
	}
	
	public void talk() {
		System.out.println(this.fullName + " is talking");
	}
	public Person() { }
}
