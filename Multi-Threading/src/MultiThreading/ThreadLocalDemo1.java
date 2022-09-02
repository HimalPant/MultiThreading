package MultiThreading;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object intialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Himal Pant");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}
