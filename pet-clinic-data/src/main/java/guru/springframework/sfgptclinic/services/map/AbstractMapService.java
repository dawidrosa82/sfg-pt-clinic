package guru.springframework.sfgptclinic.services.map;

import guru.springframework.sfgptclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntity,ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
                map.put(object.getId(), object);
            }
        } else {
            throw new RuntimeException("Object can`t br null");
        }
        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long id = null;
        try {
            return Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            id = 1l;
        }
        return id;
    }
}
