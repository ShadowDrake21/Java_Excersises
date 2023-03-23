package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PetTest {

	public static void main(String[] args) {
		Map<String, Pet> treeMap = new TreeMap<>();
		
		treeMap.put("Rocky", new Parrot());
		treeMap.put("Jerry", new Cat());
		treeMap.put("Alicja", new Dog());
		treeMap.put("Jola", new Parrot());
		treeMap.put("Malgorzata", new Parrot());
		treeMap.put("Wolf", new Cat());
		treeMap.put("Triumphator", new Dog());
		
		System.out.println("Список ключей:");
		printAllKeys(treeMap);
	}
	
	public static <T> void printAllKeys(Map<String, Pet> treeMap) {
		Set<String> set = treeMap.keySet();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
