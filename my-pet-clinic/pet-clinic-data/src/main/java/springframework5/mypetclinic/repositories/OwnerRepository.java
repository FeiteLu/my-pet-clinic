package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
