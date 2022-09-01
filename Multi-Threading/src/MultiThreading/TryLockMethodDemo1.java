package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread24 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThread24(String name) {
		super(name);
	}

	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock and performing safe operation");
					Thread.sleep(2000);
					l.unlock();
					System.out.println(Thread.currentThread().getId() + " unable to get lock and will try again");
				}
			} catch (InterruptedException e) {
			}

		} while (true);

	}

}

public class TryLockMethodDemo1 {
	public static void main(String[] args) {
		MyThread24 t1 = new MyThread24("First Thread");
		MyThread24 t2 = new MyThread24("Second Thread");
		t1.start();
		t2.start();

	}
}
