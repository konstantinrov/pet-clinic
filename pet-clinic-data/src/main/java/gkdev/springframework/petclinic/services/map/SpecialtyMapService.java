package gkdev.springframework.petclinic.services.map;

import gkdev.springframework.petclinic.model.Specialty;
import gkdev.springframework.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 05/04/2020 - 19:05
 * @project pet-clinic
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
