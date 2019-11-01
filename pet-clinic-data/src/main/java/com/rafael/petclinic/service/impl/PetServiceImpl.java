package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.PetEntity;
import com.rafael.petclinic.repositories.PetRepository;
import com.rafael.petclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetServiceImpl implements PetService {
    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<PetEntity> findAll() {
        Set<PetEntity> petEntities = new HashSet<>();
        petRepository.findAll().forEach(petEntities::add);
        return petEntities;
    }

    @Override
    public PetEntity findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public PetEntity save(PetEntity entity) {
        return petRepository.save(entity);
    }

    @Override
    public void delete(PetEntity entity) {
        petRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
