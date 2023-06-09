package Package;

class ABC  {
	static void Sam() {
		System.out.println("1 st");
	}
}

class BCD extends ABC {
	static void Ram() {
		System.out.println("2 nd");
	}
}

public class Statics extends BCD {

	static void Rams() {
		System.out.println("yes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABC as = new ABC();
		Rams();
		Sam();
		Ram();

	}

}
// here we r create 2 class in upper positions and declare one method using static but we can't call directly for that we want 
// to create object of method present class in main method 
//but if we want don't want to create object in main method then use extends then we will call that method easily by just 
// writing only method name
// and for that we want to use extends to 2nd class of 1st class means multilevel inheritance
