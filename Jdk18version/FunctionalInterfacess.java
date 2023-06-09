package Jdk18version;

@FunctionalInterface  // SAM ()Single Abstract Method)
interface Depar {
	void get();
	// this is only one single abstract method and ending with ;
	static void set() {
		// but we can use many static method in SAM not ending with ; 
		// method declare

	}

	default void put() {
		//but we can use many static method in SAM

	}

}

public class FunctionalInterfacess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
