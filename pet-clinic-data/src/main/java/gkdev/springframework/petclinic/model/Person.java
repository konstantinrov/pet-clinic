package gkdev.springframework.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:08
 * @project pet-clinic
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
