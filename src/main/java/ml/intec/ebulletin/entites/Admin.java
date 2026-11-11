
package ml.intec.ebulletin.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "administrateurs")
public class Admin extends User {

    private String niveauAcces;
}
