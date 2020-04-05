package gkdev.springframework.petclinic.services.map;

import gkdev.springframework.petclinic.model.Speciality;
import gkdev.springframework.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 05/04/2020 - 19:05
 * @project pet-clinic
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
