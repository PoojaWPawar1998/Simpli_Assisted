package Thread;


public class thread implements Runnable {
	
	public void run() {
		System.out.println("Thread is running........");
	}

	public static void main(String[] args) {
		thread t1=  new thread();
		Thread t2= new Thread(t1);
		t2.start();

	}

}
