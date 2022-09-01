package MultiThreading;

public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Himal Group");
		System.out.println(g.getParent().getName());
		System.out.println(g.getName());
		ThreadGroup g1 = new ThreadGroup(g, "Nanu");
		System.out.println(g1.getParent().getName());
		System.out.println(g1.getName());
	}

}
