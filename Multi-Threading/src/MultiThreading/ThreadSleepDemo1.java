package MultiThreading;

class MyThread14 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am lazy Thread - " + i);
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

public class ThreadSleepDemo1 {
	public static void main(String[] args) {
		MyThread14 t = new MyThread14();
		t.start();
		t.interrupt();
		System.out.println("Main Thread");
	}

}
/*
 * In the above example the interrupt call waited until child thread completes
 * for 5 times.
 */
