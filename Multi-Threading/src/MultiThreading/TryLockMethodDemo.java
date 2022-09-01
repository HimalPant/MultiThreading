package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

class MyThread23 extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThread23(String name) {
		super(name);
	}

	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got lock and performing safe operation");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getId() + " unable to get lock and hence performing alternative operations");
		}
	}
}

public class TryLockMethodDemo {
	public static void main(String[] args) {
		MyThread23 t1 = new MyThread23("First Thread");
		MyThread23 t2 = new MyThread23("Second Thread");
		t1.start();
		t2.start();

	}
}
