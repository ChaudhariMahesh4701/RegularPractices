package ExceptionHandling;

public class ThrowExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check(22);
		
	}
		
		static void Check(int age) {
			if (age<18)
				throw new ArithmeticException("Age is not valid");
			else {
				System.out.println("Age is valid");
			}
		}

	}

