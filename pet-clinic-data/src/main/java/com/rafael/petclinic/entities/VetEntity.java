package com.rafael.petclinic.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vets")
public class VetEntity extends PersonEntity {

    @Builder
    public VetEntity(Long id, String firstName, String lastName, Set<SpecialityEntity> specialities) {
        super(id, firstName, lastName);
        this.specialities = specialities;
    }

    @ManyToMany
    @JoinTable(name = "vet_specialities",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<SpecialityEntity> specialities;
}
