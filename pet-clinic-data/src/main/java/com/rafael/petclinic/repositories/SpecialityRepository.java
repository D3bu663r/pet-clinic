package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.SpecialityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<SpecialityEntity, Long> {
}
