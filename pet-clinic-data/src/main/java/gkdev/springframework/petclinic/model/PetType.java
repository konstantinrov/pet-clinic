package gkdev.springframework.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:10
 * @project pet-clinic
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
