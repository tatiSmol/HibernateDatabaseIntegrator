import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class SubscriptionKey implements Serializable {
    @Column(name = "student_id", nullable = false, insertable = false, updatable = false)
    private int studentId;
    @Column(name = "course_id", nullable = false, insertable = false, updatable = false)
    private int courseId;
}
