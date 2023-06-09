package Constructor;
class Customer{
	
	int custid;
	String custname;
	String custPhone;
	String custex;
	
	// here we are using constructors 9 t0 23 and direct csll object in syso
	/*
	 * public Customer(int custid, String custname, String custPhone, String custex)
	 * {
	 * 
	 * this.custid = custid; this.custname = custname; this.custPhone = custPhone;
	 * this.custex = custex; }
	 * 
	 * 
	 * @Override public String toString() { return "Customer [custid=" + custid +
	 * ", custname=" + custname + ", custPhone=" + custPhone + ", custex=" + custex
	 * + "]"; }
	 */
	// here we are using getter setter  22 to 68 
	
	public int getCustid() {
		return custid;
	}


	public void setCustid(int custid) {
		this.custid = custid;
	}


	public String getCustname() {
		return custname;
	}


	public void setCustname(String custname) {
		this.custname = custname;
	}


	public String getCustPhone() {
		return custPhone;
	}


	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}


	public String getCustex() {
		return custex;
	}


	public void setCustex(String custex) {
		this.custex = custex;
	}


	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custPhone=" + custPhone + ", custex="
				+ custex + "]";
	}
	
	
}
public class Constructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for constructor
		/*
		 * Customer sc = new Customer(1, "sham", "1234567890", "yzy");
		 * System.out.println(sc);
		 */
		
		// for getter setter
		Customer ss = new Customer();
		ss.setCustid(101);
		ss.setCustname("RAMS");
		ss.setCustPhone("9876543210");
		ss.setCustex("ZZXZ");
		
		System.out.println(ss);
	}

}
