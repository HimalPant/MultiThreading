package MultiThreading;

class MyThread4 extends Thread {
	public void run() {
		System.out.println("Run method");
	}
}

public class IllegalThreadStateException {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();

		t.start(); // If you are start the same thread again then we will get run time exception
					// saying IllegalThreadStateException
		System.out.println("Main Thread Execution");

	}

}
