package OOPsConcepts;
class ParentClas
{
	int a=1;
	void Method3()
	{
		System.out.println("Here is Method 1");
	}
}

class SubChildClass1 extends ParentClas
{
	int a=2;
	 void Method4()
	{
		System.out.println("Here is Method 2");
	}
}

class SubChildClass2 extends SubChildClass1
{
	int a=3;
	void Method5()
	{
		System.out.println("Here is Method 3");
	}
}

class ChildClas extends SubChildClass2
{
	int a=4;
	void Method6()
	{
		System.out.println("Here is Method 4");
		System.out.println(this.a);
		System.out.println(super.a);
		super.Method3();

	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClas ss = new ChildClas();
		ss.Method3();
		ss.Method4();
		ss.Method5();
		ss.Method6();
		MultilevelInheritance sa =new MultilevelInheritance();
		get();
		sa.gett();
		
	}
	public static void get()
	{
		System.out.println("12345677900");
	}
	
	public void gett()
	{
		System.out.println("ABCD");
	}
	
	
}
