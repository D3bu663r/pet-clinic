package com.rafael.petclinic.entities;

import com.rafael.petclinic.entities.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "pet_types")
public class PetTypeEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
}
