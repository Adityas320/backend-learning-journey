import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hash = new HashSet<>();
		Set<String> linked = new LinkedHashSet<>();
		Set<String> tree = new TreeSet<>();
		
		String[] names = {"charlie", "alice" , "charlie","bob","alice"};
		for(String n: names) {
			hash.add(n);
			linked.add(n);
			tree.add(n);
			
		}
		Set<Point> pts = new TreeSet<>();
		pts.add(new Point(3, 1));
		pts.add(new Point(1, 2));
		pts.add(new Point(1, 1));
		System.out.println(pts);
		System.out.println("HashSet:       " + hash);
        System.out.println("LinkedHashSet: " + linked);
        System.out.println("TreeSet:       " + tree);
		

	}

}
