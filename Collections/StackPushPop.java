package Collections;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

// while printing its all perfect but while deleting it it follows LIFO order

public class StackPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> list = new ArrayList<>();
		//list.add(new String ("Mahesh"));
		Stack<String> v = new Stack<>();
		v.push("Saurabh");
		v.push("Suraj");
		v.push("Divyesh");
		v.push("Prajwal");
		// removed prajwal
		//v.pop();
		// removed divesh 
		//v.pop(); 
		System.out.println(v);
		// First in First Out
		Iterator<String> itr =v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
}
