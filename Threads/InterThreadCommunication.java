package Threads;
class Customer {
	int custAccBal=100;

	synchronized public void withdrawMoney(int amount) {
		System.out.println("going to withdraw money");
		if (custAccBal<amount) {
			System.out.println("Insufficient fund");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} this.custAccBal-=amount;
	System.out.println("Withdraw Sucessfully");
	}

	synchronized public void depositMoney (int amount) {
		System.out.println("Going to deposit");
		this.custAccBal+=amount;
		System.out.println("Money Deposited");
		//notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cc = new Customer();
		new Thread() {
			public void run() {
				cc.withdrawMoney(150);
			};
		}.start();

	}

}
