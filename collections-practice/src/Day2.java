import java.util.Iterator;
import java.util.ArrayList;
public class Day2 {

	public static void main(String[] args) {
		ArrayList<String> tasks = new ArrayList<>();
		tasks.add("email");
		tasks.add("done");
		tasks.add("call");
		tasks.add("done");
		tasks.add("report");
		
//		for(String t: tasks) {
//			if(t.equals("done")) {
//				tasks.remove(t);
//			}
//		}
		Iterator<String> it = tasks.iterator();
		while(it.hasNext()) {
			String t = it.next();
			if(t.equals("done")) {
				it.remove();
			}
		}
		System.out.println(tasks);

	}

}
