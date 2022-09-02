package MultiThreading;

class ParentThread extends Thread {
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "cc";
		}
	};

	public void run() {
		tl.set("PP");
		System.out.println("Parent thread value..........." + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}

}

class ChildThread extends Thread {
	public void run() {
		System.out.println("Child thread value..........." + ParentThread.tl.get());
	}
}

public class ThreadLocalDemo3 {
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}

}
/*
 * In the above program if we replace InheritableThreadLocal with ThreadLocal
 * and if we don't override childValue() method then output is like Parent
 * thread value...........PP Child thread value...........null
 * 
 * In the above program if we are maintaining InheritableLocalThread and if we
 * don't override childValue() method then output is like Parent thread
 * value...........PP Child thread value...........pp
 * 
 */
