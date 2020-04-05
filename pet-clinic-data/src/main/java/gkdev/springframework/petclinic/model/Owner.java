package gkdev.springframework.petclinic.model;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:09
 * @project pet-clinic
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
