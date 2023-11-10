import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "linkedPurchaseList")
public class LinkedPurchase {
    @EmbeddedId
    private LinkedPurchaseKey linKey;
}
