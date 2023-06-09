package Threads;
class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("YES !");
	}
	
}
public class Threadds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		Thread tt = new Thread(aa);
		tt.start();
	

	}

}
