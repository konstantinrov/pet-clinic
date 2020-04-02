package gkdev.springframework.petclinic.services.map;

import gkdev.springframework.petclinic.model.Vet;
import gkdev.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 13:33
 * @project pet-clinic
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
