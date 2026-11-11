
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
@Table(name = "classes")
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom;

    private String niveau;

    private String filiere;

    private String salle;

    @OneToMany(mappedBy = "classe")
    private List<Eleve> eleves = new ArrayList<>();

    @OneToMany(mappedBy = "classe")
    private List<Matiere> matieres = new ArrayList<>();
}
