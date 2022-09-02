package MultiThreading;

public class ThreadLocalDemo {
	public static void main(String[] args) {
		ThreadLocal t = new ThreadLocal();
		System.out.println(t.get());
		t.set("Himal");
		System.out.println(t.get());
		t.remove();
		System.out.println(t.get());
	}

}
