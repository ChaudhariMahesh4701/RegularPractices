package Threads;
class Threads extends Thread {
	public void run() {
		System.out.println("run Method");
	}
}
public class ThreadStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads ss = new Threads();
		ss.start();
		ss.start();
		 
	}

}