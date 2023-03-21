package collections;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {
	
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		System.out.println("Set1: ");
		printSet(set1);
		System.out.println("Set2: ");
		printSet(set2);
		
		System.out.println("Union:");
		printSet(union(set1, set2));
		System.out.println("Intersection:");
		printSet(intersection(set1, set2));
	}

	public static <T> Set<T>union(Set<T> set1, Set<T> set2){
		Set<T> union = new HashSet<>(set1);
		union.addAll(set2);
		return union;
	}
	
	public static <T> Set<T>intersection(Set<T> set1, Set<T> set2){
		Set<T> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
	
	public static void printSet(Set<?> set) {
		System.out.print(set);
		System.out.println();
	}
}
