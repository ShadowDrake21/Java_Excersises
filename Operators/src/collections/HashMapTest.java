package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Product> hashMap = new HashMap<>();
		
		hashMap.put("Винни-Пух", new Product("Мягкая игрушка", 90.94));
		hashMap.put("Молния Макквин", new Product("Машинка", 900.94));
		hashMap.put("Бабочка", new Product("Пластмассовая игрушка", 109.94));
		hashMap.put("Винни-Пух", new Product("Раскраска", 708.94));
		hashMap.put("Фея", new Product("Подушка", 350.94));
		
		printEntrySet(hashMap);
		System.out.println();
		printKeySet(hashMap);
		System.out.println();
		printValues(hashMap);
	}

	public static void printEntrySet(Map<String, Product> hashMap) {
		System.out.println("Пары значений:");
		for(Entry<String, Product> entry : hashMap.entrySet()) {
			System.out.println(entry.toString());
		}
	}
	
	public static void printKeySet(Map<String, Product> hashMap) {
		System.out.println("Имена продуктов:");
		for(String string : hashMap.keySet()) {
			System.out.println(string);
		}
	}
	
	public static void printValues(Map<String, Product> hashMap) {
		System.out.println("Значения продуктов:");
		for(Product product : hashMap.values()) {
			System.out.println(product.toString());
		}
	}
}
