package gkdev.springframework.petclinic.services.map;

import gkdev.springframework.petclinic.model.Specialty;
import gkdev.springframework.petclinic.model.Vet;
import gkdev.springframework.petclinic.services.SpecialtyService;
import gkdev.springframework.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 13:33
 * @project pet-clinic
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(spec -> {
                if (spec.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(spec);
                    spec.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
