import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class Day10 {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
			names.add("charlie");
			names.add("alice");
			names.add("bob");
			names.add("dave");
			names.sort(null);
			System.out.println("Natural (A-Z): " + names);
			
			names.sort(Comparator.reverseOrder());
			System.out.println("Reversed (Z-A): "+ names);
			
			names.sort(Comparator.comparingInt(String :: length));
			System.out.println("By length: " + names);
	}
}
