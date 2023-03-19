package generics;

import java.io.Serializable;

import animals.Animal;

public class ThreeGen <T extends Comparable,V extends Animal & Serializable,K extends Number>{
	public T firstVar;
	public V secondVar;
	public K thirdVar;
	
	public ThreeGen(T firstVar, V secondVar, K thirdVar) {
		this.firstVar = firstVar;
		this.secondVar = secondVar;
		this.thirdVar = thirdVar;
	}

	public T getFirstVar() {
		return firstVar;
	}

	public V getSecondVar() {
		return secondVar;
	}

	public K getThirdVar() {
		return thirdVar;
	}
	
	public void getClasses() {
		System.out.println("Äëÿ firstVar: " + firstVar.getClass());
		System.out.println("Äëÿ secondVar: " + secondVar.getClass());
		System.out.println("Äëÿ thirdVar: " + thirdVar.getClass());
	}
}
