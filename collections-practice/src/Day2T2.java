import java.util.ArrayList;
public class Day2T2 {
// java 8 new alternative
	public static void main(String[] args) {
		ArrayList<String> tasks2 = new ArrayList<>();
		tasks2.add("email");
		tasks2.add("done");
		tasks2.add("call");
		tasks2.add("done");
		tasks2.add("report");
		
		tasks2.removeIf(t -> t.equals("done"));
		
		System.out.println(tasks2);

	}

}
