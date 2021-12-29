package guru.springframework.sfgptclinic.services;

import guru.springframework.sfgptclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById (Long id);

    Pet save (Pet pet);

    Set<Pet> findAll ();

}
