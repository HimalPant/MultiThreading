package MultiThreading;

class MyThread19 extends Thread {

}

public class DaemonThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); // false
		// Thread.currentThread().setDaemon(true); RE: IllegalThreadStateException
		MyThread19 t = new MyThread19();
		System.out.println(t.isDaemon()); // false
		t.setDaemon(true);
		System.out.println(t.isDaemon()); // true

	}

}
