package com.rafael.petclinic.service;

import com.rafael.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Set<Owner> findAll(Long id);

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
