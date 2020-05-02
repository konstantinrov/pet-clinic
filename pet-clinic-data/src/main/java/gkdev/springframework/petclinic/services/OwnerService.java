package gkdev.springframework.petclinic.services;

import gkdev.springframework.petclinic.model.Owner;

import java.util.List;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 18:07
 * @project pet-clinic
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
