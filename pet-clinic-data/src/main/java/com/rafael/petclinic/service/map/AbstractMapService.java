package com.rafael.petclinic.service.map;

import com.rafael.petclinic.service.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    protected T save(ID id, T entity) {
        return map.put(id, entity);
    }

    @Override
    public void delete(T entity) {
        map.entrySet().removeIf(_entity -> _entity.getValue().equals(entity));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}
