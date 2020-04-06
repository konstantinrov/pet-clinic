package gkdev.springframework.petclinic.model;

/**
 * @author Konstantin Romanov
 * @created 05/04/2020 - 18:09
 * @project pet-clinic
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
