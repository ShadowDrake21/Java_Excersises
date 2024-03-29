package threads;

public class SuspendResume {

	public static void main(String[] args) {
		NewThreadSuspRes ob1 = new NewThreadSuspRes("One");
		NewThreadSuspRes ob2 = new NewThreadSuspRes("Two");
		
		ob1.t.start();
		ob2.t.start();
		
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread One");
			ob2.mysuspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Suspending thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Main thread exiting.");
	}

}
