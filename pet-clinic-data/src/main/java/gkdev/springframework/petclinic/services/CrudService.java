package gkdev.springframework.petclinic.services;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 13:08
 * @project pet-clinic
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
