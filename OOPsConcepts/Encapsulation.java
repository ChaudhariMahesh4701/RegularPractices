package OOPsConcepts;

public class Encapsulation {
	private int Eid;

	private String Ename;

	private String EAddress;

	private double ESalary;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEAddress() {
		return EAddress;
	}

	public void setEAddress(String eAddress) {
		EAddress = eAddress;
	}

	public double getESalary() {
		return ESalary;
	}

	public void setESalary(double eSalary) {
		ESalary = eSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation Emp = new Encapsulation();
		Emp.setEid(121);
		Emp.setEname("Sham");
		Emp.setEAddress("Bopal");
		Emp.setESalary(12);

		System.out.println("Employee Id " + Emp.getEid() + "\nEmployee Name " + Emp.getEname() + "\nEmployee Address "
				+ Emp.getEAddress() + "\nEmployee Salary " + Emp.getESalary() + "");
		
		

	}

}
