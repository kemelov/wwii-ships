package kg.app.wwiiships.repositories;

import kg.app.wwiiships.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ClassesRepo extends JpaRepository<Classes, Long> {
    List<Classes> findAll();
    Optional<Classes> findByName(String name);
}
