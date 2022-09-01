package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

class display{
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for(int i=0; i<=5; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		l.unlock();
	}
}
class MyThread22 extends Thread{
	String name;
	display d;
	MyThread22(display d,String name){
		this.d = d; 
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class ReentrantLockDemo2 {
	public static void main(String[] args) {
		display d = new display();
		MyThread22 t1 = new MyThread22(d, "Dhoni");
		MyThread22 t2 = new MyThread22(d, "Virat");
		t1.start();
		t2.start();
		
	}
}
