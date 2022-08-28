package MultiThreading;

class MyThread8 extends Thread {

}

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(7);
		// Thread.currentThread().setPriority(57); : Here we will get RE saying:
		// IllegalArgumentExcetpion

		MyThread8 t = new MyThread8();
		System.out.println(t.getPriority());
	}

}
