package ExceptionHandling;

public class ExceptionHandlingBasic {
	static int i=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(i==1) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Incorrect");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Yes it's Finally");
		}
	}
}