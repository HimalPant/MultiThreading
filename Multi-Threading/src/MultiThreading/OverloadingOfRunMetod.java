package MultiThreading;

class MyThread1 extends Thread {
	public void run() {
		System.out.println("No arg run");
	}

	// Overloading of run() method is possible but the Thread class start() method
	// can invoke no-arg run() method only. The overloaded run() method we have to
	// call them explicitly like normal method call.
	
	public void run(int i) {
		System.out.println("Arg run method");
	}
}

public class OverloadingOfRunMetod {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
	}

}
