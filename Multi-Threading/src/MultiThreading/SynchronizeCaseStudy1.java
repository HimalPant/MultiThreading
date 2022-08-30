package MultiThreading;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning: ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}

	}

}

class MyThread16 extends Thread {
	Display d;
	String name;

	public MyThread16(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

/*
 * Even though wish() method is synchronized we will get irregular output
 * because Threads are operating on different java objects. So if multiple
 * threads are operating on same java object synchronized is required and if
 * multiple threads are operating on multiple java objects then synchronzation
 * is not required.
 */
public class SynchronizeCaseStudy1 {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread16 t1 = new MyThread16(d1, "Himal");
		MyThread16 t2 = new MyThread16(d2, "Rajendra");
		t1.start();
		t2.start();
	}

}
