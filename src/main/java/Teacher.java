import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int a_id;

    @Column(name = "name", nullable = false)
    private String b_name;

    @Column(name = "salary")
    private int c_salary;

    @Column(name = "age")
    private int d_age;
}
