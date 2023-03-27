package threads;

public class NewThreadBookDemo {

	public static void main(String[] args) {
		NewThreadBook nt = new NewThreadBook();
		
		nt.t.start();
		
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}

}
