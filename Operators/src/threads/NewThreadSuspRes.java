package threads;

public class NewThreadSuspRes implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	
	public NewThreadSuspRes(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		suspendFlag = false;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
	
	synchronized void mysuspend() {
		suspendFlag = true;
	}
	
	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}
