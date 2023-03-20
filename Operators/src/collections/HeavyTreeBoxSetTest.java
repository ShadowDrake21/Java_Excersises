package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyTreeBoxSetTest {

	public static void main(String[] args) {
		SortedSet<HeavyBox> treeSet = new TreeSet<HeavyBox>();
		
		for(int i = 0; i < 10; i++) {
			treeSet.add(new HeavyBox(i*2 + 1.5));
		}
		
		for(HeavyBox x : treeSet) {
			x.getDescription();
		}
	}
}
