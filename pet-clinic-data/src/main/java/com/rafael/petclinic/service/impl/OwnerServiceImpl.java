package com.rafael.petclinic.service.impl;

import com.rafael.petclinic.entities.OwnerEntity;
import com.rafael.petclinic.repositories.OwnerRepository;
import com.rafael.petclinic.repositories.PetRepository;
import com.rafael.petclinic.repositories.PetTypeRepository;
import com.rafael.petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public OwnerEntity findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<OwnerEntity> findAll() {
        Set<OwnerEntity> ownerEntities = new HashSet<>();
        ownerRepository.findAll().forEach(ownerEntities::add);
        return ownerEntities;
    }

    @Override
    public OwnerEntity findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public OwnerEntity save(OwnerEntity entity) {
        return ownerRepository.save(entity);
    }

    @Override
    public void delete(OwnerEntity entity) {
        ownerRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }
}
