
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EleveRepository extends JpaRepository<Eleve, Long> {

    Optional<Eleve> findByMatricule(String matricule);

    List<Eleve> findByClasseId(Long classeId);

    boolean existsByMatricule(String matricule);
}
