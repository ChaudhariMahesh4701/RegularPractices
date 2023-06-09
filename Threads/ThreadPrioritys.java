package Threads;

class MyThreads1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Threads 1 is running");
	}
}

class MyThreads2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Threads 2 is running");
	}
}

class MyThreads3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Threads 3 is running");
	}
}

public class ThreadPrioritys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreads1 aa = new MyThreads1();
		MyThreads2 bb = new MyThreads2();
		MyThreads3 cc = new MyThreads3();
		
		aa.setPriority(10);
		bb.setPriority(3);
		cc.setPriority(1);
		
		aa.start();
		bb.start();
		cc.start();
		
		System.out.println(aa.getPriority()); 
		System.out.println(bb.getPriority()); 
		System.out.println(cc.getPriority()); 
		
		System.out.println(aa.getId());
		System.out.println(bb.getId());
		System.out.println(cc.getId());
		
		aa.setDaemon(true);

	}

}
