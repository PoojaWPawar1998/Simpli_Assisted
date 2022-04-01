package extendindThread;

public class extendindThread extends Thread {
	public void run() {
		System.out.println("Thread is running......");
	}

	public static void main(String[] args) {
		extendindThread t1= new extendindThread();
		t1.start();
	}

}
