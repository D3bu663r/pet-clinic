package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.VetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<VetEntity, Long> {
}
