package MultiThreading;
class MyThread11 extends Thread
{
	public void run()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Exception is caught");
			}
		}
	}
}
public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread11 t = new MyThread11();
		t.start();
		//t.join();  -------------(i)
		/*
		 * If we comment line first then Child Thread and main Thread will be executed simultaneously
		 * and we won't expect exact output order.
		 * If we don't comment line first then Main thread calls join() method on Child thread object
		 * Hence main thread will wait until Child thread gets completed.
		 */
		for(int i=0; i<3; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
