import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class PurchaseKey implements Serializable {
    @Column(name = "student_name", insertable = false, updatable = false)
    private String a_studentName;

    @Column(name = "course_name", insertable = false, updatable = false)
    private String b_courseName;
}
