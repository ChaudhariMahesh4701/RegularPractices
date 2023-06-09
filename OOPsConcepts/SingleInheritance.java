package OOPsConcepts;

class ParentClass {
	
	void Method1() {
		System.out.println("Its a 1st method from 1st class");
	}
}

class ChildClass extends ParentClass {
	void Method2() {
		System.out.println("Its a 2nd method from 2nd class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass sc = new ChildClass(); 
		sc.Method1(); 
		sc.Method2();
		System.out.println("\n");
		 
		
		ParentClass ss = new ChildClass();
		ss.Method1();
		((ChildClass) ss).Method2();
		System.out.println("\n");
		
		
		 ChildClass sm = (ChildClass)new ParentClass();
		 sm.Method1(); 
		 sm.Method2();
		 		
	}
}