package classnotes;

public class ThreadEx2 implements Runnable {//thread -->runnable
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread ...");
		}
	}

	public static void main(String[] args) {
		ThreadEx2 obj=new ThreadEx2();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
