package Package;

public class Statics1 {
// always execute static block first before main method also
	static  {
		System.out.println("YES");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
