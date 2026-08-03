import java.util.ArrayList;
import java.util.List;
public class Day4 {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("amit");
		students.add("sara");
		students.add("john");
		students.add("priya");
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.get(0)+" -- "+ students.get(students.size()-1));
		System.out.println(students.contains("sara"));
		students.remove("john");
		for(String s : students) {
			System.out.println("Student: " + s);
		}

	}

}
