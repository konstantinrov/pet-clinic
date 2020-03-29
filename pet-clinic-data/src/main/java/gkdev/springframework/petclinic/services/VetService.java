package gkdev.springframework.petclinic.services;


import gkdev.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 18:10
 * @project pet-clinic
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
