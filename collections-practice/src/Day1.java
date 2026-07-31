
import java.util.ArrayList;

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

	}

}
