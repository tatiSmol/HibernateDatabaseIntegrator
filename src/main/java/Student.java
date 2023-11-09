import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int a_id;

    @Column(name = "name", nullable = false)
    private String b_name;

    @Column(name = "age")
    private int c_age;

    @Column(name = "registration_date", nullable = false)
    private Date registrationDate;
}
