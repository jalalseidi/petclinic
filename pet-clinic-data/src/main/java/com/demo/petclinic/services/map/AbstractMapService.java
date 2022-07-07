package com.demo.petclinic.services.map;

import com.demo.petclinic.model.BaseEntitiy;

import java.util.*;

public class AbstractMapService<T extends BaseEntitiy, ID extends Long> {

    protected Map<Long, T> map =new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if(object != null) {
            if (object.getId() == null) {
                object.setId(getNaxtId());
            }

            map.put(object.getId(), object);
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNaxtId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
