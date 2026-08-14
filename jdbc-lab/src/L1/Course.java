package L1;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany(mappedBy = "courses")   // ← inverse; mirrors Student.courses
    private List<Student> students = new ArrayList<>();

    public Course() {}
    // getters/setters
}
