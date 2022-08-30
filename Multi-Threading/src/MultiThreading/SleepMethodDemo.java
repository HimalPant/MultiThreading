package MultiThreading;

public class SleepMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<5; i++)
		{
			System.out.println("Slide -" +i);
			Thread.sleep(3000);
		}
	}

}
