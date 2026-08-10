import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
public class Day1 {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("mango");
		
		System.out.println(fruits);
		fruits.set(1, "blueberry");
		System.out.println(fruits.contains("apple"));
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(fruits.size()-1));
		
		//fruits.remove("banana");
		System.out.println(fruits);
		
		for(String f : fruits) {
			System.out.println("I like " + f);
		}
		
		List<String> cities = new ArrayList<>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("delhi");
		cities.add("pune");
		cities.add("mumbai");
		cities.add("delhi");
		
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(cities.size()-1));
		Iterator<String> it = cities.iterator();
		while(it.hasNext() ) {
			String t = it.next();
			if(t.equals("delhi")) {
				it.remove();;
			}
		}
		System.out.println(cities);
		Set<String> hash = new HashSet<>(cities);
		Set<String> linked = new LinkedHashSet<>(cities);
		Set<String> tree = new TreeSet<>(cities);
	}

	

}
