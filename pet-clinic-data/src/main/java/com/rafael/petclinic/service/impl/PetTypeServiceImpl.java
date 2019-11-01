package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.PetTypeEntity;
import com.rafael.petclinic.service.PetTypeService;
import com.rafael.petclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceImpl extends AbstractMapService<PetTypeEntity, Long> implements PetTypeService {

    @Override
    public Set<PetTypeEntity> findAll() {
        return super.findAll();
    }

    @Override
    public PetTypeEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity entity) {
        return super.save(entity);
    }

    @Override
    public void delete(PetTypeEntity entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
