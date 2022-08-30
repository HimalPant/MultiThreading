package MultiThreading;

class DisplayH {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning: ");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}

	}

}

/*
 * If we are not declaring wish() method as not synchronized then we will get
 * irregular output. But if we are declaring wish() method as synchronized then
 * only one thread is allowed to execute wish() method and given display object
 * at a time and hence we will get regular output.
 * 
 */
class MyThread15 extends Thread {
	DisplayH d;
	String name;

	public MyThread15(DisplayH d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		DisplayH d = new DisplayH();
		MyThread15 t1 = new MyThread15(d, "Himal");
		MyThread15 t2 = new MyThread15(d, "Rajendra");
		t1.start();
		t2.start();
	}

}
