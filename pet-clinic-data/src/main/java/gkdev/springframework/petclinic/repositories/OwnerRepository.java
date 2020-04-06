package gkdev.springframework.petclinic.repositories;

import gkdev.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 19:08
 * @project pet-clinic
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
