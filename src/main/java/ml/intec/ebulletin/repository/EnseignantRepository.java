
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnseignantRepository
        extends JpaRepository<Enseignant, Long> {

    Optional<Enseignant> findByMatricule(String matricule);

    boolean existsByMatricule(String matricule);
}
