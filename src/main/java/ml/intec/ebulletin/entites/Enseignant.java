
package ml.intec.ebulletin.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enseignants")
public class Enseignant extends User {

    @Column(unique = true)
    private String matricule;

    private String specialite;

    @ManyToMany
    @JoinTable(
            name = "enseignant_matieres",
            joinColumns = @JoinColumn(name = "enseignant_id"),
            inverseJoinColumns = @JoinColumn(name = "matiere_id")
    )
    private List<Matiere> matieres = new ArrayList<>();
}
