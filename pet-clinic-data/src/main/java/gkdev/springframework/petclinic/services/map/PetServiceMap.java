package gkdev.springframework.petclinic.services.map;

import gkdev.springframework.petclinic.model.Pet;
import gkdev.springframework.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 13:33
 * @project pet-clinic
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
