package Strings;

public class StringsBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Talk with ");
		s.insert(10, "Talks");
		System.out.println(s);
		
		 //Starts From 3 And ends with 6  OR 
		// Always starts from 0 starts 3 and end with 6-1=5 till 6 
		
		StringBuffer sb = new StringBuffer("AshuTalkshere");
		sb.replace(3,6,"GOTIT");
		System.out.println(sb);
	}
}