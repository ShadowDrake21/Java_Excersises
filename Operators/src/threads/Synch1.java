package threads;

public class Synch1 {

	public static void main(String[] args) {
		Callme1 target = new Callme1();
		Caller1 ob1 = new Caller1(target, "Hello");
		Caller1 ob2 = new Caller1(target, "Synchronized");
		Caller1 ob3 = new Caller1(target, "World");
		
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
