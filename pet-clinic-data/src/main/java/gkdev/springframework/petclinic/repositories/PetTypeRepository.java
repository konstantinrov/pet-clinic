package gkdev.springframework.petclinic.repositories;

import gkdev.springframework.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 19:10
 * @project pet-clinic
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
