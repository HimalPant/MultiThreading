package MultiThreading;

class MyRunnable1 implements Runnable {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class CaseStudyOnThreadUsingRunnableInterface {
	public static void main(String[] args) {
		MyRunnable1 r = new MyRunnable1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		/*
		 * case 1st: t1.start(): A new thread will be created and is responsible for
		 * executing run() method of Thread class which has empty implementation
		 */
		t1.start();
		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}

		/*
		 * case 2nd: t1.run() : A new thread won't be created and Thread class run()
		 * method will be executed just like a normal method call
		 */
		t1.run();
		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}

		/*
		 * case 3rd: t2.start() : A new Thread will be created and is responsible for
		 * executing run() method of MyRunnable1 class
		 */
		t2.start();
		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}

		/*
		 * case 4th: t2.run() : A new Thread won't be created and MyRunnalbe class run()
		 * method will be executed just like a normal method call
		 */
		t2.run();
		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}

		/*
		 * case 5th : r.start() : We will get compile time error saying MyRunnalbe class
		 * doesn't have start capacity.
		 */

		/*
		 * case 6th: r.run() : No new thread will be created and MyRunnalbe1 class run()
		 * method will be executed just like normal method call
		 */
		r.run();
		t2.run();
		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}

	}
}
