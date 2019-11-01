package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.PetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<PetEntity, Long> {
}
