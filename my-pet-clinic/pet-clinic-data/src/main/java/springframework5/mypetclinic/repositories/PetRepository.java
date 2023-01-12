package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
