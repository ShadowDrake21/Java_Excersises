package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Queue<HeavyBox> queue = new ArrayDeque<>();
		
		queue.offer(new HeavyBox(110.4));
		queue.offer(new HeavyBox(11.0));
		queue.offer(new HeavyBox(12.5));
		queue.offer(new HeavyBox(134.8));
		
		queue.forEach(System.out::println);
		
		System.out.println("\nЁлементы, которые удал€ютс€:");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("\nѕосле удалени€:");
		queue.forEach(System.out::println);
	}

}
