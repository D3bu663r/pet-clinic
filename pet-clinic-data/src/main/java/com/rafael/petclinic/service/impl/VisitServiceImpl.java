package com.rafael.petclinic.service.impl;


import com.rafael.petclinic.entities.VisitEntity;
import com.rafael.petclinic.repositories.VisitRepository;
import com.rafael.petclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VisitServiceImpl implements VisitService {
    private final VisitRepository visitRepository;

    public VisitServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<VisitEntity> findAll() {
        Set<VisitEntity> visitEntities = new HashSet<>();
        visitRepository.findAll().forEach(visitEntities::add);
        return visitEntities;
    }

    @Override
    public VisitEntity findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public VisitEntity save(VisitEntity entity) {
        return visitRepository.save(entity);
    }

    @Override
    public void delete(VisitEntity entity) {
        visitRepository.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
