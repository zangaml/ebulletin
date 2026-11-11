
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.AnneeScolaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnneeScolaireRepository
        extends JpaRepository<AnneeScolaire, Long> {

    Optional<AnneeScolaire> findByLibelle(String libelle);

    boolean existsByLibelle(String libelle);

    Optional<AnneeScolaire> findByActiveTrue();
}
