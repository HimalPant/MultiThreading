package MultiThreading;

class Display1 {
	public synchronized void displayn() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(200);

			} catch (InterruptedException e) {

			}
		}
	}

	public synchronized void displayc() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}

}

class MyThread17 extends Thread {
	Display1 d1;

	MyThread17(Display1 d1) {
		this.d1 = d1;
	}

	public void run() {
		d1.displayc();
	}
}

public class SynchronizedDemo1 {
	public static void main(String[] args) {
		Display1 d1 = new Display1();
		MyThread17 t1 = new MyThread17(d1);
		MyThread17 t2 = new MyThread17(d1);
		t1.start();
		t2.start();
		/*
		 * The output will be like ABCDEFGHIJKABCDEFGHIJK because both of the thread
		 * executing the same block that is why output is repeated
		 */
	}
}
