package gkdev.springframework.petclinic.repositories;

import gkdev.springframework.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 19:11
 * @project pet-clinic
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
