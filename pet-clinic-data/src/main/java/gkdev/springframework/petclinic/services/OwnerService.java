package gkdev.springframework.petclinic.services;

import gkdev.springframework.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 18:07
 * @project pet-clinic
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
