
package ml.intec.ebulletin.repository;

import ml.intec.ebulletin.entites.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByBulletinId(Long bulletinId);

    List<Note> findByMatiereId(Long matiereId);

    List<Note> findByEnseignantId(Long enseignantId);
}
