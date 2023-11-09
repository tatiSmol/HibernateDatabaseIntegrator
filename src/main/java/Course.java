import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int a_id;

    @Column(name = "name")
    private String b_name;

    @Column(name = "duration")
    private int c_duration;

    @Enumerated
    @Column(name = "type", nullable = false, columnDefinition = "enum('DESIGN','PROGRAMMING','MARKETING','MANAGEMENT','BUSINESS')")
    private CourseType d_type;

    @Column(name = "description")
    private String e_description;

    @Column(name = "teacher_id")
    private int f_teacherId;

    @Column(name = "students_count")
    private Integer g_studentsCount;

    @Column(name = "price")
    private int h_price;

    @Column(name = "price_per_hour")
    private float i_pricePerHour;
}
