
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

    List<Matiere> findByClasseId(Long classeId);

    Optional<Matiere> findByCode(String code);
}
