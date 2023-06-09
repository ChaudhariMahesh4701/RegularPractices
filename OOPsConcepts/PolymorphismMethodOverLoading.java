package OOPsConcepts;

class Class1{
	void Method1() {
		System.out.println("Method 1 with no parameter \n");
	}
	void Method1(int a) {
		System.out.println("Method 1 with int parameter"+"  a: "+a+"\n");
	}
	final void Method1(int a,int b) {
		System.out.println("Method 1 with int and int parameter"+"  a: "+a+" b: "+b+"\n final overloading is possible easily because of different parameters"+"\n");
	}
	static void Method1(int a,String d) {
		System.out.println("Method 1 with int and string parameter"+"  a: "+a+" d: "+d+"\n static overloading is possible easily because of different parameters");
	}
}

public class PolymorphismMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 as = new Class1();
		as.Method1();
		as.Method1(10);
		as.Method1(20, 30);
		//as.Method1(100, "Done");
		Class1.Method1(100, "Done");
		System.out.println("\n We can easily Overload the main method easily with different parameters");
		

	}
}
