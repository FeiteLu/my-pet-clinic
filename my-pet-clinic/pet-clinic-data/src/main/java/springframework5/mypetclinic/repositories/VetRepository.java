package springframework5.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.mypetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
