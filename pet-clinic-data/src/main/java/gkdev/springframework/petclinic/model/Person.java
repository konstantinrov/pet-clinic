package gkdev.springframework.petclinic.model;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 14:08
 * @project pet-clinic
 */
public class Person  extends BaseEntity{

    private String firstName;
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
