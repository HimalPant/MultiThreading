package MultiThreading;

class MyThread21 extends Thread {
	public MyThread21(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}

public class ThreadGroupDemo3 {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildThread");
		MyThread21 t1 = new MyThread21(pg, "ChildThread1");
		MyThread21 t2 = new MyThread21(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}
