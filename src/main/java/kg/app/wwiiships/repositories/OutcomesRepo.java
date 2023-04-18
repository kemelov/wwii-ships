package kg.app.wwiiships.repositories;

import kg.app.wwiiships.models.Outcomes;
import kg.app.wwiiships.models.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutcomesRepo extends JpaRepository<Outcomes, Long> {
    List<Outcomes> findByResult(Result result);
}
