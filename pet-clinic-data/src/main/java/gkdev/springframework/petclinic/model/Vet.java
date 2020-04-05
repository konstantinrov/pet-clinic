package gkdev.springframework.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:09
 * @project pet-clinic
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
