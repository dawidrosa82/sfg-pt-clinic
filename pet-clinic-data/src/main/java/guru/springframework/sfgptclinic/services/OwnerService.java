package guru.springframework.sfgptclinic.services;

import guru.springframework.sfgptclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
