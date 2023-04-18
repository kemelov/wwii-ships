package kg.app.wwiiships.repositories;

import kg.app.wwiiships.models.Ships;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShipsRepo extends JpaRepository<Ships, Long> {
    Optional<Ships> findByName(String name);

}
