package MultiThreading;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 Starts Execution of d1() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 trying to call B's last() method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A this is the last method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread2 starts execution of d2() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B this is the last method");
	}
}

public class DeadLock1 extends Thread {
	A a = new A(); // These both are instance variables.
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b); // This line executed by main thread
	}

	public void run() {
		b.d2(a); // This line executed by child thread
	}

	public static void main(String[] args) {
		DeadLock1 d = new DeadLock1();
		d.m1(); // responsible to call a.d1(b) method.
		/*
		 * Instead of d.m1() we can take d.start() but A and B are instance variables
		 * and we cannot access instance variables directly from static area. because
		 * main method is static here......
		 */
	}
}
