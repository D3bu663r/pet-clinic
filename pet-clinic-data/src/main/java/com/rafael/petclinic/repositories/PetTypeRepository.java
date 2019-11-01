package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.PetTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetTypeEntity, Long> {
}
