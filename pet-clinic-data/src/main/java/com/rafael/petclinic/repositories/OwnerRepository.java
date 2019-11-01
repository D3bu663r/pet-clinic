package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.OwnerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<OwnerEntity, Long> {
}
