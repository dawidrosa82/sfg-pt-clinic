package guru.springframework.sfgptclinic.bootstrap;

import guru.springframework.sfgptclinic.model.Owner;
import guru.springframework.sfgptclinic.model.Vet;
import guru.springframework.sfgptclinic.services.OwnerService;
import guru.springframework.sfgptclinic.services.VetService;
import guru.springframework.sfgptclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgptclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1l);
        owner.setFirstName("Dawid");
        owner.setLastName("Boniek");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2l);
        owner1.setFirstName("Dawid");
        owner1.setLastName("Boniek");

        ownerService.save(owner1);

        System.out.println("Load owners ....");
        
        Vet vet = new Vet();
        vet.setId(1l);
        vet.setFirstName("Pupi");
        vet.setLastName("Rapi");

        vetService.save(vet);


        Vet vet1 = new Vet();
        vet1.setId(2l);
        vet1.setFirstName("Pupi");
        vet1.setLastName("Rapi");

        vetService.save(vet1);

        System.out.println("Load Vets...");
        

    }
}
