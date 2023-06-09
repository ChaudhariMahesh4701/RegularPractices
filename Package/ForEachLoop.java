package Package;

import java.util.LinkedList;
import java.util.List;

public class ForEachLoop {
	private int empId;
	private String empName;
	private double salary;

	public ForEachLoop(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "ForEachLoop [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ForEachLoop> emp = new LinkedList<>();
		emp.add(new ForEachLoop(121,"asas",2323));
		emp.add(new ForEachLoop(122,"as",2223));
		emp.add(new ForEachLoop(123,"aas",233));
		
		// First method to print
		
		emp.forEach(p->System.out.println(p));
		
		// Second method to print
		
		System.out.println("");
		emp.forEach(System.out::println);
		
		//Third method
		
		System.out.println("");
		for(ForEachLoop a :emp)
		{
			System.out.println(a);
		}
	}

}
