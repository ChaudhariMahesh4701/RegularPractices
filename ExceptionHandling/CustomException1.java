package ExceptionHandling;

public class CustomException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Check(19);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	static void Check(int age) throws CustomException2,ArithmeticException,NullPointerException {
		if (age < 18)
			throw new CustomException2("Age is not Valid");
		else {
			System.out.println("Age is valid");
		}
	}

}