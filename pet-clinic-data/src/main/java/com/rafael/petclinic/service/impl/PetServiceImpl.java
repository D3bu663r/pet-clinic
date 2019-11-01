package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.PetEntity;
import com.rafael.petclinic.service.PetService;
import com.rafael.petclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceImpl extends AbstractMapService<PetEntity, Long> implements PetService {

    @Override
    public Set<PetEntity> findAll() {
        return super.findAll();
    }

    @Override
    public PetEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetEntity save(PetEntity entity) {
        return super.save(entity);
    }

    @Override
    public void delete(PetEntity entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
