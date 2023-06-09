package Strings;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("CSI");
		String s2=new String("CSI");
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.compareTo(s2));// depends upon character 
	}
}