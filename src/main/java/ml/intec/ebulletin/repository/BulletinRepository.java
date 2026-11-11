
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BulletinRepository extends JpaRepository<Bulletin, Long> {

    List<Bulletin> findByEleveId(Long eleveId);

    List<Bulletin> findByClasseId(Long classeId);

    List<Bulletin> findByAnneeScolaireId(Long anneeScolaireId);

    List<Bulletin> findByPeriode(String periode);
}
