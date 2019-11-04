package com.rafael.petclinic.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pets")
public class PetEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    private PetTypeEntity petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OwnerEntity owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<VisitEntity> visits;

    @Column(name = "birth_date")
    private LocalDate birthDate;
}
