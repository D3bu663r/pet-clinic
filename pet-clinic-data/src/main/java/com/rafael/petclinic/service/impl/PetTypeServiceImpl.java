package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.PetTypeEntity;
import com.rafael.petclinic.repositories.PetTypeRepository;
import com.rafael.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetTypeServiceImpl implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetTypeEntity> findAll() {
        Set<PetTypeEntity> petTypeEntities = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypeEntities::add);
        return petTypeEntities;
    }

    @Override
    public PetTypeEntity findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity entity) {
        return petTypeRepository.save(entity);
    }

    @Override
    public void delete(PetTypeEntity entity) {
        petTypeRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
