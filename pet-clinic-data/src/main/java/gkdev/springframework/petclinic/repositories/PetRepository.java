package gkdev.springframework.petclinic.repositories;

import gkdev.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 19:09
 * @project pet-clinic
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
