import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
class Point {
	int x,y;
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o== null || getClass() != o.getClass()) return false;
		Point p = (Point) o;
		return x == p.x && y == p.y;
	}
	public int hashCode() {
		return java.util.Objects.hash(x,y);
	}
}
public class Day5 {
	

	public static void main(String[] args) {
//		List<String> names = new ArrayList<>();
//		names.add("amit");
//		names.add("sara");
//		names.add("amit");
//		names.add("john");
//		names.add("sara");
//		System.out.println("List: " + names);
//		
//		Set<String> unique = new HashSet<>(names);
//		System.out.println("Set: "+ unique);
//		Set<String> tags = new HashSet<>();
//		System.out.println(tags.add("java"));    
//		System.out.println(tags.add("python"));
//		System.out.println(tags.add("java"));    
//		System.out.println(tags);
//		System.out.println(tags.contains("python"));
//		System.out.println(tags.size());
		Set<Point> points = new HashSet<>();
		points.add(new Point(1, 2));
		points.add(new Point(1, 2));  
		System.out.println(points.size());
		// this was the insertion

	}

}
