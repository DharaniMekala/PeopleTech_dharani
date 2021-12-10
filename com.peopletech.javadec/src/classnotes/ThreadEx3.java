package classnotes;

public class ThreadEx3 implements Runnable {//thread -->runnable
	@Override
	public void run() {
		System.out.println(Thread.currentThread());//5
		Thread.currentThread().setPriority(6);
		
		Thread.currentThread().setName("slept");
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread ...");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("sleeping");
		System.out.println(Thread.currentThread().getPriority());
		ThreadEx3 obj=new ThreadEx3();
		Thread t1=new Thread(obj);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ...");//priority 1-10
		}
	}

}
