package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
