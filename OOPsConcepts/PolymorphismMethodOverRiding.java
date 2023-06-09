package OOPsConcepts;
class Class2{
	void Method1() {
		System.out.println("Method 1  \n");
	}
}
class Class3 extends Class2 {
	@Override
	void Method1() {
		System.out.println("Method 2 is overriding \n");
		super.Method1();
	}
}
class Class4 extends Class3 {
	@Override
	void Method1() {
		System.out.println("Method 3 is overriding \n");
		super.Method1();
	}
}
public class PolymorphismMethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4 ss= new Class4();
		ss.Method1();
		System.out.println("Next");

	}

}