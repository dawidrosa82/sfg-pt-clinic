package guru.springframework.sfgptclinic.bootstrap;

import guru.springframework.sfgptclinic.model.Owner;
import guru.springframework.sfgptclinic.model.Vet;
import guru.springframework.sfgptclinic.services.OwnerService;
import guru.springframework.sfgptclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Dawid");
        owner.setLastName("Boniek");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Tomek");
        owner1.setLastName("Book");

        ownerService.save(owner1);

        System.out.println("Load owners ....");
        
        Vet vet = new Vet();
        vet.setFirstName("Pupi");
        vet.setLastName("Rapi");

        vetService.save(vet);


        Vet vet1 = new Vet();
        vet1.setFirstName("Japi");
        vet1.setLastName("Lupi");

        vetService.save(vet1);

        System.out.println("Load Vets...");

        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat mirusFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = format.parse((String)"2021-07-03T00:00:00.000+0200");
        mirusFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String   result = mirusFormat.format(date);
        System.out.println( result);
        String date1 = format.format(new Date());
        System.out.println(TimeZone.getDefault());
    }
}
