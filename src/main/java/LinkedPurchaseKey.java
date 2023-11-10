import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class LinkedPurchaseKey implements Serializable {
    @Column(name = "student_id", insertable = false, updatable = false)
    private int a_studentId;

    @Column(name = "course_id", insertable = false, updatable = false)
    private int b_courseId;
}
