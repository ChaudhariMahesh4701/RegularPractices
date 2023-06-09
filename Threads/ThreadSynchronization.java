package Threads;

class Table {
	synchronized public void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i*n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
}

class MyThread1 extends Thread { 
	Table table;

	public MyThread1(Table t) {
		this.table = t;
	}

	public void run() {
		table.printTable(1);
	}
}

class MyThread2 extends Thread {
	Table table;

	public MyThread2(Table t) {
		this.table = t;
	}

	public void run() {
		table.printTable(11);
	}
}

class MyThread3 extends Thread {
	Table table;

	public MyThread3(Table t) {
		this.table = t;
	}

	public void run() {
		table.printTable(10);
	}
}

class MyThread4 extends Thread {
	Table table;

	public MyThread4(Table t) {
		this.table = t;
	}

	public void run() {
		table.printTable(101);
	}
}

class MyThread5 extends Thread {
	Table table;

	public MyThread5(Table t) {
		this.table = t;
	}

	public void run() {
		table.printTable(1234);
	}
}

public class ThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table tt = new Table();

		MyThread1 a1 = new MyThread1(tt);
		MyThread2 a2 = new MyThread2(tt);
		MyThread3 a3 = new MyThread3(tt);
		MyThread4 a4 = new MyThread4(tt);
		MyThread5 a5 = new MyThread5(tt);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();

	}

}