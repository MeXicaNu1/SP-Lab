package ro.euvt.springtest.persistence.interfaces;

public interface CrudRepository<T> {
    Long save(T object);
    T getById(Long id);

}
