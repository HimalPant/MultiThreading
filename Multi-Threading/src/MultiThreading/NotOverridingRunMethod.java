package MultiThreading;

class MyThread2 extends Thread {

}

// If we are not overriding run() method then Thread class run() method will be executed which has empty implementation. 
//Hence we won't get any output

public class NotOverridingRunMethod {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
	}

}
