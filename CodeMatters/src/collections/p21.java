package collections;

import java.util.*;

public class p21 {

	public static void main(String[] args) {
		List<String> Student_list = new ArrayList<>();
		Student_list.add("Aditya");
		Student_list.add("Adi");
		Student_list.add(2, "rahul");
		Student_list.add("carino");
		Student_list.add("nautanki");
		Student_list.add("moon");
		Student_list.remove("moon");
		Student_list.set(1, "choubey");
		System.out.println(Student_list);
	}

}
