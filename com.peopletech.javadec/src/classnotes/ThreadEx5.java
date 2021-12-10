package classnotes;

public class ThreadEx5 implements Runnable {// thread -->runnable
	@Override
	public void run() {// running
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread ...");
		}
	}// dead ,end

	public static void main(String[] args) throws InterruptedException {

		ThreadEx5 obj = new ThreadEx5();// new state
		Thread t1 = new Thread(obj);
		t1.start();// runnable-->ready to run
			t1.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread ...");// priority 1-10
		}

	}

}

// t1-->6  yield()    t2-->4      t3-->6

//
