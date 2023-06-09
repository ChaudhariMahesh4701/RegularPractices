package Package;

public class Finalize {

	@Override
	public void finalize()  {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize a = new Finalize();
		Finalize b = new Finalize();
		System.out.println(a);
		System.out.println(b);
		a = b ;
		System.out.println(a+"\n"+b);
		//System.gc();

	}

}
