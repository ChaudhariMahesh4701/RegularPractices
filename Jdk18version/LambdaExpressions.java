package Jdk18version;

interface Dept {
	void get();
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dd = () -> System.out.println("Welcome to Anudip");
		;
		dd.get();

	}

}
