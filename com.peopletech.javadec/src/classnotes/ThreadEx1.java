package classnotes;

public class ThreadEx1 extends Thread {//thread -->runnable
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread ...");
		}
	}

	public static void main(String[] args) {
		ThreadEx1 obj=new ThreadEx1();
		
		obj.start();
	}

}
