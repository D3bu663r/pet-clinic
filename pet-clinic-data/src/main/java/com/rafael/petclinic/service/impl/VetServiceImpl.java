package com.rafael.petclinic.service.impl;


import com.rafael.petclinic.entities.VetEntity;
import com.rafael.petclinic.repositories.VetRepository;
import com.rafael.petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<VetEntity> findAll() {
        Set<VetEntity> vetEntities = new HashSet<>();
        vetRepository.findAll().forEach(vetEntities::add);
        return vetEntities;
    }

    @Override
    public VetEntity findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public VetEntity save(VetEntity entity) {
        return vetRepository.save(entity);
    }

    @Override
    public void delete(VetEntity entity) {
        vetRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
