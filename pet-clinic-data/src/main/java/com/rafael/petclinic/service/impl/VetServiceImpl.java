package com.rafael.petclinic.service.impl;


import com.rafael.petclinic.model.Vet;
import com.rafael.petclinic.service.VetService;
import com.rafael.petclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceImpl extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
