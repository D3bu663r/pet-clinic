package com.rafael.petclinic.repositories;

import com.rafael.petclinic.entities.VisitEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<VisitEntity, Long> {
}
