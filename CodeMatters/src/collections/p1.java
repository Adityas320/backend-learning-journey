package collections;
import java.util.*;
class Student {
	int id;
	String name;
	Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
} 

public class p1 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Aditya");
		names.add("rahul");
		System.out.println(names);
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		System.out.println(numbers);
		Student s1=new Student(1,"Aditya");
		Student s2=new Student(2,"Rahul");
		ArrayList<Student> students =new ArrayList<>();
		students.add(s1);
		students.add(s2);
	}

}
