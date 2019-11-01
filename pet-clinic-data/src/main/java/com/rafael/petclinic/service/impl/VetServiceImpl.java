package com.rafael.petclinic.service.impl;


import com.rafael.petclinic.entities.VetEntity;
import com.rafael.petclinic.service.VetService;
import com.rafael.petclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceImpl extends AbstractMapService<VetEntity, Long> implements VetService {

    @Override
    public Set<VetEntity> findAll() {
        return super.findAll();
    }

    @Override
    public VetEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public VetEntity save(VetEntity entity) {
        return super.save(entity);
    }

    @Override
    public void delete(VetEntity entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
