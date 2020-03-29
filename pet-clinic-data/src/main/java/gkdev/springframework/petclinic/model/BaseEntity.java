package gkdev.springframework.petclinic.model;

import java.io.Serializable;

/**
 * @author Konstantin Romanov
 * @created 29/03/2020 - 18:16
 * @project pet-clinic
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
