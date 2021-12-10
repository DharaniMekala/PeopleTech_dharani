package classnotes;

public class ThreadEx4 implements Runnable {// thread -->runnable
	@Override
	public void run() {//running
		for (int i = 0; i < 5; i++) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Child Thread ...");
		}
	}//dead ,end

	public static void main(String[] args) {

		ThreadEx4 obj = new ThreadEx4();//new state 
		Thread t1 = new Thread(obj);
		t1.start();//runnable-->ready to run
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread ...");// priority 1-10
		}
	}

}
