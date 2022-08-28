package MultiThreading;
class MyThread7 extends Thread
{
	public void run()
	{
		System.out.println("Run method executed by Thread: "+ Thread.currentThread().getName());
	}
}
public class CurrentExecutingThreadObject {
	public static void main(String[] args) {
		MyThread7 t = new MyThread7();
		t.start();
		System.out.println("Mani Thread Executed by Thread: "+ Thread.currentThread().getName());
	}

}
