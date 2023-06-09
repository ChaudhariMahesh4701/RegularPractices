package OOPsConcepts;

class ParentClasss {
	void Method1() {
		System.out.println("Method 1");
	}
}

class ChildClasss1 extends ParentClasss {
	void Method2() {
		System.out.println("Method 2");
	}
}

class ChildClasss2 extends ParentClasss {
	void Method3() {
		System.out.println("Method 3");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClasss a = new ParentClasss(); // Always create Parent Class First and then Child Class 
		ChildClasss1 b = new ChildClasss1(); 
		ChildClasss2 c = new ChildClasss2();

		//ChildClasss1 d = new ParentClasss(); // If we create Child Class First then it will give compile time error

		a.Method1();
		b.Method1();
		b.Method2();
		c.Method1();
		c.Method3();

	}
}