package MultiThreading;

class MyThread13 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("I am lazy Thread");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("I got interrupted");
		}
	}
}

/*
 * If we comment line first then main thread won't interrupt child thread. In
 * this case the child thread will execute for given specified number of times.
 * If we are commenting line first then main thread interrupt child thread. In
 * this case output will be like this 
 * End of main thread 
 * End of main thread 
 * End of main thread 
 * End of main thread 
 * I am lazy Thread 
 * I got interrupted
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		MyThread13 t = new MyThread13();
		t.start();
		t.interrupt(); // ----------(i)
		for (int i = 0; i < 4; i++) {
			System.out.println("End of main thread");
		}

	}

}
/*
 * Whenever we are calling interrupt() method, if the target thread is not in
 * waiting or sleeping state then there is no impact of interrupt() method call
 * immediately. Interrupt call will be waited until target thread enter into
 * sleeping or waiting state. If the target thread enter into the waiting or
 * sleeping state then immediately interrupt call will interrupt the target
 * thread.
 * 
 * If a target thread never enters into the waiting or sleeping state then there
 * is no impact of interrupt call. This is the only case when the interrupt call
 * will be wasted.
 */
