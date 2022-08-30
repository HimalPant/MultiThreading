package MultiThreading;

class MyThread10 extends Thread {
	public void main() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
			// Thread.yield();-------------(i)
		}
	}
}
/*
 * If we are commenting line first then we cannot expect exact output. If we are not commenting 
 * line first then Main method will be executed first because child method always calls yield()
 * method.
 * Some platform cannot provide proper support for this approach.
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		MyThread10 t = new MyThread10();
		t.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
		}
	}

}
