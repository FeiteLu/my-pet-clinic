package springframework5.mypetclinic.services;

import springframework5.mypetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
