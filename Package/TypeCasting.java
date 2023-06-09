package Package;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		int x=6,y=4;
		a=x/y;
		// here variable x is converted from int to float
		b=(float)x/y;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		// Second Method
		float d = 6.35f;
		System.out.println("value of converting into int is : "+(int) d);
		System.out.println("original Value "+d);
		// Third Method
		// Double to int TypeCasting
		int i=20;
		double g=40.47;
		int add = (int)g+i;
		System.out.println("add is "+add);
	}
}
/* Priority
Multiplication,Division,Modular
Addition,Subtraction
=(Assignment)*/