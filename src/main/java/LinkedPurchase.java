import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "linkedPurchaseList")
public class LinkedPurchase {
    @EmbeddedId
    private LinkedPurchaseKey linKey;

    public LinkedPurchase(int studentId, int courseId) {
        this.linKey = new LinkedPurchaseKey(studentId, courseId);
    }
}
