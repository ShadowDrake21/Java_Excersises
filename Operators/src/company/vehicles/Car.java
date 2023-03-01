package company.vehicles;

import company.details.Engine;
import company.professions.Driver;

public abstract class Car {
	private String model;
	private String autoClass;
	private double weight;
	private Driver driver;
	private Engine engine;
	
	public void start() {
		System.out.println("Поехали");
	}
	
	public void stop() {
		System.out.println("Останавливаемся");
	}
	
	public void turnRight() {
		System.out.println("Поворот направо");
	}
	
	public void turnLeft() {
		System.out.println("Поворот налево");
	}

	@Override
	public String toString() {
		return "Car [model=" + model 
				+ ", autoClass=" + autoClass 
				+ ", weight=" + weight 
				+ ", driver=" + driver
				+ ", engine=" + engine + "]";
	}
	
	
}
