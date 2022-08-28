package MultiThreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		// t.start(); //In the case of t.start() a new thread will be created which is
		// responsible for the execution of run method. start() method is considered as
		// the heart of the multi-threading
		t.run(); // In the case of t.run() a new thread won't be created and run method is
					// executed just like a normal method call by main() method
	}

}
