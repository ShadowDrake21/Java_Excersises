package threads;

public class Caller1 implements Runnable {
	String msg;
	Callme1 target;
	Thread t;
	
	public Caller1(Callme1 targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
	}
	
	@Override
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
		
	}
	
}
