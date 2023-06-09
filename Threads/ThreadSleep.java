package Threads;
class Mads  extends Thread{
	public void run() {
		for(int i=0;i<=10;i++)
			try {
				Thread.sleep(1000);
				System.out.println("Yes ! ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mads aa = new Mads();
		aa.start();
		

	}

}
