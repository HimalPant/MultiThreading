package MultiThreading;

class MyThread5 extends Thread {
	public void run() {
		System.out.println("Child Thread");
	}
}

public class SelfApproachToDefineAThread {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main Thread");
	}

}
