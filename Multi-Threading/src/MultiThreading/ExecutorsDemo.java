package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + "...Job started by thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "...Job started by thread: " + Thread.currentThread().getName());
	}
}

public class ExecutorsDemo {
	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Himal"), new PrintJob("Rajendra"), new PrintJob("Krishna"),
				new PrintJob("Mukesh"), new PrintJob("Prakash"), new PrintJob("Shubham") };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}
/*
 *While developing/Designing web servers and application servers we can use Thread Pool concept. 
*/