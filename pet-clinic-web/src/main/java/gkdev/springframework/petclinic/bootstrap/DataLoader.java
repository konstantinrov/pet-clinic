package gkdev.springframework.petclinic.bootstrap;

import gkdev.springframework.petclinic.model.Owner;
import gkdev.springframework.petclinic.model.PetType;
import gkdev.springframework.petclinic.model.Vet;
import gkdev.springframework.petclinic.services.OwnerService;
import gkdev.springframework.petclinic.services.PetTypeService;
import gkdev.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Konstantin Romanov
 * @created 02/04/2020 - 15:24
 * @project pet-clinic
 */
@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Marlik");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cooper");
        PetType savedCatPetType = petTypeService.save(dog);

        Owner owner = new Owner();
        owner.setFirstName("Michael");
        owner.setLastName("Weston");

        ownerService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet = new Vet();
        vet.setFirstName("Sam");
        vet.setLastName("Axe");

        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Samuelle");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");
    }
}
