package gkdev.springframework.petclinic.model;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:09
 * @project pet-clinic
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
