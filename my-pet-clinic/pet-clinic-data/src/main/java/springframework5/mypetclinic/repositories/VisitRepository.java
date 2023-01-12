package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
