package Constructor;

class Department{
	int deptid;
	String deptname;
	String deptcode;
	
	public Department() {
		System.out.println(deptid+deptname+deptcode);
	}
	
	public Department(int deptid,String deptname,String deptcode) {
		super();
		this.deptid=deptid;
		this.deptname=deptname;
		this.deptcode=deptcode;
	}
		void show() {
			System.out.println(deptid+deptname+deptcode);
			
		}
	}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dd = new Department();
		Department ss = new Department(1,"sam","AASS"+"\n");
		ss.show();
		dd.show();
	}
}