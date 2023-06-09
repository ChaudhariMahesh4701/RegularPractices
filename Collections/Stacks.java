package Collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> sd = new Stack<String>();
		sd.push("First");
		sd.push("Second");
		sd.push("Third");
		sd.push("Fourth");
		System.out.println(sd);
		sd.pop();
		System.out.println(sd.peek());
		// while printing its all perfect but while deleting it it follows LIFO order

	}
}
/*Function
 * push() pop() peek() isEmpty()
 */