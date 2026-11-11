
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

    Optional<Classe> findByNom(String nom);

    boolean existsByNom(String nom);
}
