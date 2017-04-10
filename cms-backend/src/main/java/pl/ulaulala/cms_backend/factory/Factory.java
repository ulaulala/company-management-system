package pl.ulaulala.cms_backend.factory;

import java.util.List;
import java.util.stream.Collectors;

public interface Factory<D, E> {

    D create(E entity);

    default List<D> createList(List<E> entities) {
        return entities.stream()
                .map(this::create)
                .collect(Collectors.toList());
    }

}
