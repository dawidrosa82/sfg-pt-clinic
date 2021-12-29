package guru.springframework.sfgptclinic.services;

import guru.springframework.sfgptclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();

}
