package com.rafael.petclinic.service;

import com.rafael.petclinic.entities.OwnerEntity;

public interface OwnerService extends CrudService<OwnerEntity, Long> {
    OwnerEntity findByLastName(String lastName);
}
