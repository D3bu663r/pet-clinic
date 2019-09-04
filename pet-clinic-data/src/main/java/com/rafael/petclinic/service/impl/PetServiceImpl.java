package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.model.Pet;
import com.rafael.petclinic.service.PetService;
import com.rafael.petclinic.service.map.AbstractMapService;

import java.util.Set;

public class PetServiceImpl extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
