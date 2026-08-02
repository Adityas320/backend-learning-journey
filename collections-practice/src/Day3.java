
import java.util.ArrayList;
import java.util.LinkedList;
public class Day3 {
	public static void main(String args[]) {
		ArrayList<String> messylist = new ArrayList<>();
		messylist.add("hello");
		messylist.add("42");
		messylist.add("true");
		
		LinkedList<String> queue = new LinkedList<>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		//this is queue
		// this is again queue
		System.out.println(queue);          
		System.out.println(queue.get(1));   
		queue.remove("second");
		System.out.println(queue); 
		
//		String first = messylist.get(0);   
//		System.out.println(first);
//		System.out.println(messylist);
//		String second = messylist.get(1);
//		System.out.println(second);
	}
}
