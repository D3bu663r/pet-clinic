package com.rafael.petclinic.service.map;

import com.rafael.petclinic.model.BaseEntity;
import com.rafael.petclinic.service.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T entity) {
        if (entity == null) return null;
        if (entity.getId() == null)
            entity.setId(getNextId());
        return map.put((ID) entity.getId(), entity);
    }

    @Override
    public void delete(T entity) {
        map.entrySet().removeIf(_entity -> _entity.getValue().equals(entity));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()).longValue() + 1L;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
