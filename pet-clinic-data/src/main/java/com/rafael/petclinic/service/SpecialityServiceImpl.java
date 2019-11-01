package com.rafael.petclinic.service;


import com.rafael.petclinic.entities.SpecialityEntity;
import com.rafael.petclinic.repositories.SpecialityRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    private final SpecialityRepository specialityRepository;

    public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<SpecialityEntity> findAll() {
        Set<SpecialityEntity> VisitEntities = new HashSet<>();
        specialityRepository.findAll().forEach(VisitEntities::add);
        return VisitEntities;
    }

    @Override
    public SpecialityEntity findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public SpecialityEntity save(SpecialityEntity entity) {
        return specialityRepository.save(entity);
    }

    @Override
    public void delete(SpecialityEntity entity) {
        specialityRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
