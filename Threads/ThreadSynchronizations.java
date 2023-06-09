package Threads;
class Tables {
	
	
	/// not dones yet
	
	
	
	
	
	
	synchronized public void printTable(String s) {
		
		System.out.println("");
	}
}


class Threads1 extends Thread {
	Table table;
	
	public Threads1(Table t) {
		this.table = t;
	}
	
	public void run() {
		table.printTable(1);
	}
}
public class ThreadSynchronizations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
