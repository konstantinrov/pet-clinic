package gkdev.springframework.petclinic.repositories;

import gkdev.springframework.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 19:11
 * @project pet-clinic
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
