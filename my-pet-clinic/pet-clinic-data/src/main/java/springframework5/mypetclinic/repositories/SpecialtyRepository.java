package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
