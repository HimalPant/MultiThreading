package MultiThreading;

class MyThread3 extends Thread {
	public void start() {
		super.start();
		System.out.println("Start method");
	}

	public void run() {
		System.out.println("Run method");
	}
}

public class OverRidingStartMethod {
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("Main Method");
	}

}
