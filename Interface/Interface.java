package Interface;

interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)

	default void slap() {
		System.out.println("its is default method in interface \n");
	}

	static void sham() {
		System.out.println("its is static method in interface \n");
	}
}

// Pig "implements" the Animal interface
class Pig implements Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee \n");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig myPig = new Pig(); // Create a Pig object
		myPig.slap();
		Animal.sham();
		myPig.animalSound();
		myPig.sleep();

	}
}