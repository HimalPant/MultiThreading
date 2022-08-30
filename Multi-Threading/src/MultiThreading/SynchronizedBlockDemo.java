package MultiThreading;

class Display3 {
	public void wishme(String name) {
		// ;;;;;;;;;;;;; one millions line of codes
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}
		}
		// ;;;;;;;;;;;;; one thousand lines of codes
	}
}

/*
 * Lock concept is applicable only for class type and object types but not
 * primitive types that's why we cannot pass primitive types as argument to the
 * synchronized block otherwise we will get compile time error saying 
 * unexpected type 
 * found: int
 * required: reference
 */
class MyThread18 extends Thread {
	String name;
	Display3 d2;

	MyThread18(String name, Display3 d2) {
		this.name = name;
		this.d2 = d2;

	}

	public void run() {
		d2.wishme(name);
	}

}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Display3 d2 = new Display3();
		MyThread18 t1 = new MyThread18("Himal", d2);
		MyThread18 t2 = new MyThread18("Nanu", d2);
		t1.start();
		t2.start();

	}

}
