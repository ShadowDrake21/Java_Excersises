package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSeparation {

	public static void main(String[] args) {
		Set<HeavyBox> mainSet = new HashSet<>();
		
		mainSet.add(new HeavyBox(301.4));
		mainSet.add(new HeavyBox(111.1));
		mainSet.add(new HeavyBox(501.3));
		mainSet.add(new HeavyBox(91.6));
		mainSet.add(new HeavyBox(1012.3));
		
		System.out.println("Изначальный set: ");
		printSet(mainSet);
		System.out.println("===========================================");
		
		Iterator<HeavyBox> iterate = mainSet.iterator();
		Set<HeavyBox> set1 = new HashSet<>();
		Set<HeavyBox> set2 = new HashSet<>();
		
		while(iterate.hasNext()) {
			HeavyBox boxIter = iterate.next();
			if(boxIter.getWeight() > 300.00) {
				set1.add(boxIter);
			}
			else {
				set2.add(boxIter);
			}
		}
		
		System.out.println("Set с элементами, где вес > 300 грамм: ");
		printSet(set1);
		System.out.println("===========================================");
		
		System.out.println("Set с элементами, где вес <= 300 грамм: ");
		printSet(set2);
		System.out.println("===========================================");
	}

	public static void printSet(Set<HeavyBox> set) {
		set.forEach(System.out::println);
	}
}
