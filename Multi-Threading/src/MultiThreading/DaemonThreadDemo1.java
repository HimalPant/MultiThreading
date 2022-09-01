package MultiThreading;

class MyThread20 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class DaemonThreadDemo1 {
	public static void main(String[] args) {
		MyThread20 t = new MyThread20();
		// t.setDaemon(true); -----------------(i)
		t.start();
		System.out.println("Main Thread");
	}
}

/*
 * If we are commenting line (i) main and child thread are non-daemon and hence
 * both threads will be executed until their completion
 * If we are not commenting line (i) main thread will be non-daemon thread and 
 * child thread will be daemon thread hence when main thread terminated at the 
 * moment the child thread will be terminated automatically.
 */
