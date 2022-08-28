package MultiThreading;

class MyThread9 extends Thread {
	public void run() {
		System.out.println("Child Thread");
	}
}

public class ThreadPriorityDemo1 {
	public static void main(String[] args) {
		MyThread9 t = new MyThread9();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
		}

	}
// Some platform won't provide proper support for Thread Priorities.. Hence output may be in not exact order
}
