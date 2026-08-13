package L1;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name= "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "student-course",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id")
			)
		private List<Course> courses = new ArrayList<>();
	
		public Student() {}
		public int getStuId() {return id;}
		public void setStuId(int id) {this.id=id;}
		public String getStuName() {return name;}
		public void setStuName(String name) {this.name=name;}

}
