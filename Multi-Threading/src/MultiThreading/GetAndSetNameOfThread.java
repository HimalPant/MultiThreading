package MultiThreading;

class MyThread6 extends Thread {

}

public class GetAndSetNameOfThread {
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		System.out.println(t.getName());
		Thread.currentThread().setName("Himal Pant");
		System.out.println(Thread.currentThread().getName());
	}
// We can get current executing Thread object by using Thread.currentThread().getName() method.
}
