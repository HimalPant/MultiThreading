package MultiThreading;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child Thread strts calculations");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child Thread giving notification");
			this.notify();
		}
	}

}

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main thread calling waiting method");
			b.wait();
			System.out.println("Main thread got notification");
			System.out.println(b.total);

		}

	}
}
