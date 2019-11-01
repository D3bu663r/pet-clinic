package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.OwnerEntity;
import com.rafael.petclinic.service.OwnerService;
import com.rafael.petclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceImpl extends AbstractMapService<OwnerEntity, Long> implements OwnerService {
    @Override
    public OwnerEntity findByLastName(String lastName) {
        return map.values().stream()
                .filter(entity -> entity.getLastName().equals(lastName))
                .findFirst().orElse(null);
    }

    @Override
    public Set<OwnerEntity> findAll() {
        return super.findAll();
    }

    @Override
    public OwnerEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public OwnerEntity save(OwnerEntity entity) {
        return super.save(entity);
    }

    @Override
    public void delete(OwnerEntity entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
