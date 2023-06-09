package Threads;

class ExThread extends Thread {
	public void run() {
		// System.out.println("csi pune");

		int i;
		for (i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("csi pune");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class ImplThread implements Runnable {
	public void run() {
		// System.out.println("csi pune");

		int i;
		for (i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("csi pune2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class Threadd {

	public static void main(String[] args) {

		ExThread t1 = new ExThread();
		t1.start();// consider s thread.
		// t1.run();//this consider as normal method

		ImplThread li = new ImplThread();
		Thread t2 = new Thread(li);
		t2.start();

	}

}