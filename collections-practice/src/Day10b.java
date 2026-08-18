import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 
class Person{
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	String getName() {return name;}
	int getAge() {return age;}
	public String toString() {return name + "(" + age + ")";}
}
public class Day10b {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("charlie",30));
		people.add(new Person("alice",25));
		people.add(new Person("bob",30));
		people.add(new Person("dave",22));
		
		people.sort(Comparator.comparing(Person :: getName));
		System.out.println(people);
		
		people.sort(Comparator.comparingInt(Person :: getAge));
		System.out.println(people);
		
		people.sort(Comparator.comparing(Person :: getAge).reversed());
		System.out.println(people);
		
		people.sort(Comparator.comparing(Person :: getAge).thenComparing(Person :: getName));
		System.out.println(people);
	}

}
