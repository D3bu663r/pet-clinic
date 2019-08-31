package com.rafael.petclinic.service;

import com.rafael.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Set<Vet> findAll(Long id);

    Vet findById(Long id);

    Vet save(Vet vet);
}
