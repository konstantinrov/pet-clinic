package gkdev.springframework.petclinic.services;

import gkdev.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 18:09
 * @project pet-clinic
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
