package threads;

public class MultiThreadDemo {

	public static void main(String[] args) {
		NewMultThread nt1 = new NewMultThread("One");
		NewMultThread nt2 = new NewMultThread("Two");
		NewMultThread nt3 = new NewMultThread("Tree");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Main thread exiting.");
	}

}
