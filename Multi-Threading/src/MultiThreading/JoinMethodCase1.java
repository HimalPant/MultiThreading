package MultiThreading;

class MyThread12 extends Thread {
	static Thread mt;

	public void run() {
		try {
			//mt.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Child Thread");
		}
	}
}
/*
 * In this example Child thread calls join() method on Main thread object
 * so child thread has to wait until Main thread completes execution.
 */
public class JoinMethodCase1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread12.mt = Thread.currentThread();
		MyThread12 t = new MyThread12();
		t.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
			// Thread.currentThread().join();
/*
 * If a thread calls join() method on the same thread itself then the program will be
 * Stocked i.e it is something like deadlock condition. And in this case the thread 
 * has wait for infinite number of times.
 */
			
		}
	}

}
