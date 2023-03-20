package collections;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxTest {

	public static void main(String[] args) {
		System.out.println("Создать динамический массив, содержащий объекты класса HeavyBox. ");
		List<HeavyBox> list = new ArrayList<HeavyBox>();
		for(int i = 0; i < 5; i++) {
			list.add(new HeavyBox(i*2 + 1.5));
		}
		
		System.out.println("Распечатать его содержимое используя for each. ");
		printAll(list);
		
		System.out.println("Изменить вес первого ящика на 1. ");
		HeavyBox first = list.get(0);
		first.setWeight(first.getWeight() + 1);
		printAll(list);
		
		System.out.println("Удалить последний ящик. ");
		list.remove(list.size() - 1);
		printAll(list);
		
		System.out.println("Получить массив содержащий ящики из коллекции. ");
		Object[] arr1 = list.toArray();
		printAllArr(arr1);
		
		System.out.println("Удалить все ящики. ");
		list.removeAll(list);
		printAll(list);
	}

	public static void printAll(List<HeavyBox> list) {
		for(HeavyBox x : list) {
			x.getDescription();
		}
		System.out.println("=================================");
	}
	
	public static <T> void printAllArr(T[] array) {
		for(T x : array) {
			System.out.println("Элемент массива с весом " + ((HeavyBox) x).toString());
		}
		System.out.println("=================================");
	}
}
