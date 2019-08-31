package com.rafael.petclinic.service;

import com.rafael.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Set<Pet> findAll(Long id);

    Pet findById(Long id);

    Pet save(Pet pet);
}
